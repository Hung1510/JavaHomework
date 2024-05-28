import java.util.Scanner;
public class EITAX_Personal_IncomeTax {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        long salary = sc.nextLong();
        long[] levels = { 0, 5000000, 10000000, 18000000, 32000000, 52000000, 80000000 };
        double[] TaxRates = { 0.05, 0.1, 0.15, 0.2, 0.25, 0.3, 0.35 };
        double Income = Math.max(salary - 9000000, 0);
        double totalTax = 0;
        for (int i = 6; i >= 0; i--) {
            if (Income > levels[i]) {
                totalTax += (Income - levels[i]) * TaxRates[i];
                Income = levels[i];
            }
        }
        System.out.println((long) Math.round(totalTax));
    }
}
