import java.util.Scanner;

public class EIPURCHASE_BetterSolution_MuaHangTraGop {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double itemValue = sc.nextDouble();
        int n = sc.nextInt();
        double prePaid = sc.nextDouble();
        double G = sc.nextDouble();
        double debtX = itemValue - prePaid;
        double low = 0, high = 1;
        while (high - low > 0.000000001d) {
            double middle = (high + low) / 2;
            var debt = calculate(debtX, G, n, middle); // thya doi cai calculate phia duoi nho thay doi cai nay
            if (debt > 0) {
                high= middle; // ko duoc thi doi high sang low
            } else {
                low = middle; // ko duoc thi doi low sang high
            }
        }
        System.out.printf("%.7f",low);
    }

    static double calculate(double debt, double MonthlyPay, int Month, double rate) { // co the thay doi gia tri de tinh may cai khac
        for (var i = 0; i < Month; i++) {
            debt = debt * (1 + rate) - MonthlyPay;
        }
        return debt;
    }
}
