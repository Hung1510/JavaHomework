import java.util.Scanner;

public class EIUBIRTH_QuaSinhNhat {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long Testcases = sc.nextLong();
        long b, r, x, y, z;
        long minMoney = 0;
        long result = 0;
        long temp;
        for (long i = 0; i < Testcases; i++) {
            b = sc.nextLong();
            r = sc.nextLong();
            x = sc.nextLong();
            y = sc.nextLong();
            z = sc.nextLong();
            if (x == y)
                result = (b + r) * x;
            else if (x > y) {
                temp = z + y;
                minMoney = Math.min(x, temp);
                result = y * r + minMoney * b;
            } else {  // y>x
                temp = z + x;
                minMoney = Math.min(y, temp);
                result = minMoney * r + x * b;
            }
            System.out.println(result);
        }
    }
}