import java.util.Arrays;
import java.util.Scanner;
public class EIVCHR3_Voucher3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt(); // item buying
        long m = sc.nextLong(); // voucher
        long arr[] = new long[n]; // price of the items
        long totalMoney = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        int i = 0;
        Arrays.sort(arr);
        if (n == m) {
            for (int j = 0; j < n; j++) {
                if (arr[j] < 166666.667) { // 1666666.667=30%
                    totalMoney += arr[j] * 7 / 10;
                } else {
                    totalMoney += arr[j] - 50000;
                }
            }
        } else {
            for (i = 0; i < arr.length - m; i++) {
                totalMoney += arr[i];
            }
            for (i = i; i < n; i++) {
                if (arr[i] < 166666.667) {
                    totalMoney += arr[i] * 7 / 10;
                } else {
                    totalMoney += arr[i] - 50000;
                }
            }
        }
        System.out.println(totalMoney);
    }
}
// 5 2
// 100000 5000 2000 100000 200000
// out 327000