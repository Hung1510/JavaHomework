import java.util.Scanner;

public class EIBANKLOAN3_BankLoan2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double x = sc.nextLong();
        long y = sc.nextLong();
        int n = sc.nextInt();
        double r = sc.nextDouble();
        double f = sc.nextDouble();
        double m = x / n;
        double monthly = x / n;
        double rate = 0;
        int i = 1;
        double odd = 0, odd1 = 0;
        double sum = 0;
        for (; i < 100; i++) {
            if (x <= 0) {
                break;
            }
            rate = x * (r / 100 / 12);
            monthly = m * i - sum;
            monthly = Math.max(monthly, 0);
            odd1 = (y - rate - monthly);
            odd = odd1 / (1 + f / 100);
            x -= monthly + odd;
            sum += monthly + odd;
            System.out.print(i + " ");
            System.out.println(Math.round(Math.max(x, 0)));
            sc.close();
        }

    }

}