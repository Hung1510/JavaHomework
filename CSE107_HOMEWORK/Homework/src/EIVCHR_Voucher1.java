import java.util.Scanner;

public class EIVCHR_Voucher1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = sc.nextLong();
        if (n % 1000 == 0 && n<=166666.667) {
            System.out.println(n * 70 / 100);
        } else {
            System.out.println(n - 50000);
        }
    }
}
