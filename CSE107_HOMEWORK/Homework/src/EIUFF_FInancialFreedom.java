import java.util.Scanner;

public class EIUFF_FInancialFreedom {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        double r = sc.nextDouble();
        double f = sc.nextDouble();
        int Y = sc.nextInt();
        int N = sc.nextInt();
        double high = Long.MAX_VALUE;
        double low = 0, middle = 0;
        while (high - low > 0.00001) {
            middle = (low + high) / 2;
            double remain = calculatingRemain(middle, N, r, f, Y);
            if (remain > 0) {
                high = middle;
            } else {
                low = middle;
            }
        }
        System.out.println(sb.append((double) ((middle * 1000) / 1000))); // System.out.printf("%.4f", middle);->(work))
    }

    static double calculatingRemain(double X, int N, double r, double f, int Y) {
        for (var i = 0; i < N - 1; i++) {
            X = X * (1 + r / 100) - Y * Math.pow(1 + f / 100, i);
        }
        return X;
    }
}
