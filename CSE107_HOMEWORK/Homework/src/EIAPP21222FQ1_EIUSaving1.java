import java.util.Scanner;

public class EIAPP21222FQ1_EIUSaving1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double money = sc.nextDouble();
        int m = sc.nextInt();
        double[] rate = { 0, 0.0390, 0.0392, 0.0395, 0.0399, 0.0404, 0.0554, 0.0572, 0.0592, 0.0614, 0.0638, 0.0664,0.0692 };
        int year = m / 12;
        money = money * Math.pow(1 + rate[12], year); // lấy số tiền sau khi tinh lãi suất mũ lên với số năm(year)
        int month = m % 12;
        money = money * (1 + rate[month] / 12 * month);
        System.out.println(Math.round(money));
    }
}