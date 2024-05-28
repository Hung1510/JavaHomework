import java.util.Scanner;
import java.lang.Math;

public class EISNAIL_Snail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long V, A, B;
        A = sc.nextLong();
        B = sc.nextLong();
        V = sc.nextLong();
        double days = Math.ceil((double) (V - A) / (A - B)) + 1;
        System.out.println((int) days);
        sc.close();
    }
}