import java.util.Scanner;

class EIGROSS2_GrossSalary2023 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long salary = sc.nextLong();
        double gross = 0;
        int mil = 1000000;
        long[] level = { 0, 5 * mil, 10 * mil, 18 * mil, 32 * mil, 52 * mil, 80 * mil, Long.MAX_VALUE };
        double[] rate = { 0.05, 0.1, 0.15, 0.2, 0.25, 0.3, 0.35 };
        if (salary <= 11 * mil) { // if salary below 11000000 then tax dont applied
            System.out.println(salary);
        } else {
            salary -= 11 * mil;
            for (int i = 0; i < rate.length; i++) {
                double salary_level = (level[i + 1] - level[i]) * (1 - rate[i]);
                if (salary < salary_level) {
                    gross += salary / (1 - rate[i]);
                    break;
                } else {
                    gross += salary_level / (1 - rate[i]);
                    salary -= salary_level;
                }
            }
            System.out.println((long) Math.round(gross) + 11 * mil);
        }
    }
}