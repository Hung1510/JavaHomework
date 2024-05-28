import java.util.Scanner;

public class EIUPURCHASE3_InstallmentPurchase3 {
    static Scanner sc = new Scanner(System.in);
    static long P, M;
    static int N;
    static double R;

    public static void main(String[] args) {
        Input();
        double debt = P - M;
        double MonthlyPayment = (debt * Math.pow(1 + R, N) * R) / (Math.pow(1 + R, N) - 1);
        System.out.println((long) Math.floor(MonthlyPayment));
    }
    static void Input() {
        P = sc.nextLong(); // price
        M = sc.nextLong();// prepaid money
        N = sc.nextInt(); // month customer want to pay
        R = sc.nextDouble(); // expected interest rate want
    }
}
// 19990000 10000000 12 0.045
// 1095565