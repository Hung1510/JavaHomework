import java.util.Scanner;

public class EIUCHRMS_ChristmasDiscount {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = 1000000;
        long arr[] = new long[n];
        long sum = 0;
        long value[] = { 2 * m, 5 * m, 10 * m, 20 * m, 50 * m, 100 * m, 200 * m, Long.MAX_VALUE };
        double rate[] = { 0.97, 0.96, 0.95, 0.94, 0.93, 0.92, 0.91, 0.9 };
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        for (int i = 0; i < arr.length; i++) {
            loop: for (int j = 0; j < value.length; j++) {
                if (arr[i] <= value[j]) {
                    sum += arr[i] * rate[j];
                    break loop;
                }
            }
        }
        System.out.println(sum);
    }
}
