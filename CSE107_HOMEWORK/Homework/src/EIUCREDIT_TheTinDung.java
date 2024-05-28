import java.util.Scanner;

public class EIUCREDIT_TheTinDung {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        double rate = sc.nextDouble();
        int period = sc.nextInt();
        long[] trans = new long[period + 1];

        for (int i = 0; i < n; i++) {
            int date = sc.nextInt();
            long val = sc.nextLong();
            trans[date] += val;
        }

        double balance = 0;
        double debt = 0;

        for (int t = 1; t <= period; t++) {
            if (balance < 0) {
                debt += balance;
            }
            balance += trans[t];
            if (t % 30 == 1) {
                balance += debt / 30 * rate;
                debt = 0;
            }
        }
        System.out.println(balance);
    }

}