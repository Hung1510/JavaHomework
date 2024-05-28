import java.util.Scanner;

public class EITAX2_PersonalTax2023 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long salary = sc.nextLong();
        int mil = 1000000;
        double tax = 0;
        long[] level = { 0, 5 * mil, 10 * mil, 18 * mil, 32 * mil, 52 * mil, 80 * mil, Long.MAX_VALUE };
        double[] rate = { 0.05, 0.1, 0.15, 0.2, 0.25, 0.3, 0.35 };
        salary -= 11 * mil;
        for (var i = 0; i < level.length; i++) {
            if (salary >= level[i])
                tax += (Math.min(salary, level[i + 1]) - level[i]) * rate[i];
        }
        System.out.println((long)Math.ceil(tax));
    }
}
