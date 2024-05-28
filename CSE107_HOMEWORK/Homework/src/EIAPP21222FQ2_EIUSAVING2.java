import java.util.Scanner;

public class EIAPP21222FQ2_EIUSAVING2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        var month = sc.nextInt();
        double TotalSaving = 0;
        for (var i = 0; i < month; i++) {
            var saving = sc.nextDouble();
            TotalSaving += SavingCalculation(saving, month - i);
        }
        System.out.println(Math.round(TotalSaving));
    }
    public static double[] rate = { 0, 0.0390, 0.0392, 0.0395, 0.0399, 0.0404, 0.0554, 0.0572, 0.0592, 0.0614, 0.0638, 0.0664, 0.0692 };
    public static double SavingCalculation(double saving, int month) {
        int year = month / 12;
        saving = saving * Math.pow(1 + rate[12], year);
        month = month % 12;
        saving = saving * (1 + rate[month] / 12 * month);
        return saving;
    }
}