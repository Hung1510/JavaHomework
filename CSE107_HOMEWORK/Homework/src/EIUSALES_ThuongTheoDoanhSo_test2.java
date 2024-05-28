import java.util.Scanner;

public class EIUSALES_ThuongTheoDoanhSo_test2 { // hieu qua hon test1
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        long SaleAmount = sc.nextLong();
        int values[] = { 0, 20, 50, 200, 500, 2000, Integer.MAX_VALUE };
        double BonusRates[] = { 0.02, 0.03, 0.04, 0.05, 0.06, 0.07 };
        double reward = 0;
        for (int i = 0; i < values.length; i++) {
            if (SaleAmount > values[i]) {
                reward += (Math.min(SaleAmount, values[i + 1]) - values[i]) * BonusRates[i];
            }
        }
        sb.append((double) Math.round(reward * 100) / 100);
        System.out.println(sb);
    }
}