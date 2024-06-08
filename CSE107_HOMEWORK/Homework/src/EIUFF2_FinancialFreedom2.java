import java.util.Scanner;

public class EIUFF2_FinancialFreedom2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double r = sc.nextDouble(); //interest rate
        double f = sc.nextDouble(); //infaltion rate
        int C = sc.nextInt();  // money withdraw
        double rateDifference = (r - f) / 100.0;
        double minimumAmount = C / rateDifference;
        System.out.println((long)Math.ceil(minimumAmount));
    }
}