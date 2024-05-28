import java.util.Scanner;

class EIPURCHASE1_InstallmentPurchase {
    static Scanner sc = new Scanner(System.in);
    static double Value, N, M;
    static int Month;

    public static void main(String[] args) {
        getInput();
        double X = Value - N;
        for (var r = 0.0000001; r < 1; r += 0.0000001) {
            var debt = X * Math.pow((1 + r), Month) - M * (Math.pow((1 + r), Month) - 1) / r;
            if (debt >= 0) {
                System.out.printf("%.3f", r);
                break;
            }
        }
    }

    static void getInput() {
        Value = sc.nextInt();
        Month = sc.nextInt();
        N = sc.nextInt();
        M = sc.nextInt();
    }

}