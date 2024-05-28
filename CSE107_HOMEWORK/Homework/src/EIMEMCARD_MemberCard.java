import java.util.Scanner;

public class EIMEMCARD_MemberCard {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        int n = sc.nextInt(); // item purchases
        long totalPrice = 0;
        long[] CardsRequirement = { 0, 1000000, 20000000, 50000000, 200000000 };
        double[] CardsDiscount = { 0, 0.02, 0.03, 0.05, 0.07 };
        long[] prices = new long[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextLong();
            totalPrice += prices[i];
        }
        int length = prices.length;
        double[] discounts = new double[length];
        for (int i = length - 1; i > 0; i--) {
            if (totalPrice > CardsRequirement[1]) {
                totalPrice -= prices[i];
                for (int j = 4; j >= 0; j--) {
                    if (totalPrice >= CardsRequirement[j]) {
                        discounts[i] = prices[i] * CardsDiscount[j];
                        break;
                    }
                }
            }
        }
        for (double e : discounts)
            sb.append(e).append(" ");

        System.out.println(sb);
    }
}