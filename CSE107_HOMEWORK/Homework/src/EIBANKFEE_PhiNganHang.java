import java.util.Scanner;

public class EIBANKFEE_PhiNganHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        int check = sc.nextInt();
        double finalPayment;
        if (money < 500) {
            finalPayment = 12 + (check * 0.2);
            System.out.println(finalPayment);
        } else if (money < 2000) {
            finalPayment = 7.5 + (check * 0.2);
            System.out.println(finalPayment);
        } else if (money < 5000) {
            finalPayment = 5 + (check * 0.1);
            System.out.println(finalPayment);
        } else if (money >= 5000) {
            finalPayment = 0 + (check * 0);
            System.out.println(finalPayment);
            sc.close();
        }
    }
}
