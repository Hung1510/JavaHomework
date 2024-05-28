
import java.util.Arrays;
import java.util.Scanner;

class EIVCHR_Voucher2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);
        long totalmoney = 0;
        for (int i = 0; i < n - 1; i++) {
            totalmoney += arr[i];
        }
        if (arr[n - 1] < 166666.667) {
            totalmoney += (arr[n - 1] * 70 / 100);
        } else {
            totalmoney += (arr[n - 1] - 50000);
        }
        System.out.println(totalmoney);
    }
}
