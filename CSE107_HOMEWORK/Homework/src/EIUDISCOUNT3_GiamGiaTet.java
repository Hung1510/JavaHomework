import java.util.ArrayList;
import java.util.Scanner;

public class EIUDISCOUNT3_GiamGiaTet {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = sc.nextLong();
        ArrayList<Integer> a = new ArrayList<>(); // input 3 gia tri khac nhau co cach dong(1 la nhan)(0 la khong nhan)
        a.add(sc.nextInt());
        a.add(sc.nextInt());
        a.add(sc.nextInt());
        int mil = 1000000;
        long discount = 0;
        long[] levels = { 0, 5 * mil, 20 * mil, 100 * mil, 300 * mil, 600 * mil, 900 * mil, Long.MAX_VALUE };
        double[] rates = { 0, 0.03, 0.05, 0.07, 0.1, 0.12, 0.15 };
        for (int i = 0; i < levels.length - 1; i++) {
            if (n < levels[i])
                break;
            discount += (Math.min(n, levels[i + 1]) - levels[i]) * rates[i];
        }
        long PaymentAmount = n - discount;
        for (int i = 0; i < 3; i++) {
            if (a.get(i) == 0)
                PaymentAmount += 0;
            else if (a.get(i) == 1)
                PaymentAmount *= 0.98;
        }
        System.out.println(PaymentAmount);
    }
}
