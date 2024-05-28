import java.util.Scanner;

public class EIMONE_moneyexchange {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        var n = sc.nextInt();
        var denoms = new int[] { 20, 10, 5, 1 };
        for (var i = 0; i < denoms.length; i++)
            if (n >= denoms[i]) {
                System.out.println(denoms[i] + " " + (n / denoms[i]));
                n = n % denoms[i];
            }
    }
}