import java.util.Scanner;
public class EIBANKLOAN2_BankLoan1 {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        double X = sc.nextDouble(); // price of the house
        double Y = sc.nextDouble(); // maximum money huy can pay for the house per month
        double r = sc.nextDouble() / 12 / 100; // bank interest rate( rate per year so r/12)
        double Month;// FIND K(MOnth)
        if (r == 0) {
            Month = X / Y;
        } else {
            Month = Math.log(Y / (Y - X * r)) / Math.log(1 + r);
        }
        long Month_after_Ceil = (long) Math.ceil(Month);
        System.out.println(Month_after_Ceil);
    }
}
