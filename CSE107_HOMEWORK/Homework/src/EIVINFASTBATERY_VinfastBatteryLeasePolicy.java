import java.util.Scanner;

public class EIVINFASTBATERY_VinfastBatteryLeasePolicy {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = sc.nextLong();
        long m = sc.nextLong();
        long t = sc.nextLong();
        double r = sc.nextDouble() / 100;
        double x = (n * Math.pow(1 + r, t) - m) * r / (Math.pow(1 + r, t) - 1);
        System.out.println(Math.round(x));
    }
}
