import java.util.Scanner;

public class EIDINRATE_DepositInterestRate {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int testcases = sc.nextInt();
        double money;
        double rate;
        double TotalAmount;
        for (int i = 0; i < testcases; i++) {
            money = sc.nextDouble();
            rate = sc.nextDouble();
            TotalAmount = sc.nextDouble();
            display(money, rate, TotalAmount);
        }
    }
    public static void display(double money, double rate, double TotalAmount) {
        double years = Math.ceil(Math.log(TotalAmount / money) / Math.log(1 + rate / 100.0));
        System.out.println((long) years);
    }
}