import java.util.Scanner;

public class EIUBHOUSE_HomeLoan {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        double N = sc.nextDouble(); // N->(the house price(vnd)
        double M = sc.nextDouble(); // M->(money AN have(vnd)
        int K = sc.nextInt(); // K-> months
        double x = sc.nextDouble() / 100;// x-> bank rate
        N -= M;
        double payEachMonth = N / K;
        for (int i = 1; i <= K; i++) {
            double profit = (N * x);
            double pay = profit + payEachMonth;
            N -= payEachMonth;
            sb.append(i + " " + Math.round(pay)).append("\n");
        }
        System.out.println(sb);
    }
}
// Ex:1000000000 0 12 0.9

// universal code for calculating over time payment
// for(var i=0;i<K(month);i++){
// (N/K +N *(K-i)/K*X)
//