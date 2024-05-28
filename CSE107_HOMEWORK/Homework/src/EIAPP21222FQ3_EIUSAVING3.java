import java.util.Scanner;
public class EIAPP21222FQ3_EIUSAVING3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Long MoneyWanted = sc.nextLong();
        int m = sc.nextInt();
        double CurrentMoney = 0;
        double RequiredMoney = 0;
        double[] level = { 0, 3.9, 3.92, 3.95, 3.99, 4.04, 5.54, 5.72, 5.92, 6.14, 6.38, 6.64, 6.92 };
        double step = 10000;
        while (step >= 0.00001) {
            for (;; RequiredMoney += step) {
                CurrentMoney = 0;
                for (int j = m; j > 0; j--) {
                    int month = j % 12;
                    int year = j / 12;
                    double interest_month = 0;
                    double interest_year = 0;
                    interest_year = RequiredMoney * (Math.pow(1 + 6.92 / 100, year));
                    interest_month = month * interest_year * level[month] / 100 / 12;
                    if (year >= 1)
                    CurrentMoney += interest_month + interest_year;
                    else
                    CurrentMoney += interest_month + RequiredMoney;
                }
                if (CurrentMoney >= MoneyWanted)
                    break;
            }
            RequiredMoney -= step;
            step /= 10;
        }
        System.out.printf("%.4f", RequiredMoney);
    }
}
//70000 4
//17356.9857