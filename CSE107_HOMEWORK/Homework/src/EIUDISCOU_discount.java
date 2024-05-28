import java.util.Scanner;

public class EIUDISCOU_discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long money = sc.nextLong();
        int n = 2000000;
        long discount = 0;
        long[] amountmoney = { 0, n, n * 5, n * 25, n * 50, n * 100, n * 250, Long.MAX_VALUE };
        double[] discountrate = { 0, 0.03, 0.05, 0.07, 0.1, 0.12, 0.15 };
        for (int i = amountmoney.length - 1; i >= 0; i--) { 
            if (money > amountmoney[i]) {
                discount += ((Math.min(money, amountmoney[i + 1])) - amountmoney[i]) * discountrate[i];
            }
        }
        System.out.println(money - discount);
        sc.close();
    }
}