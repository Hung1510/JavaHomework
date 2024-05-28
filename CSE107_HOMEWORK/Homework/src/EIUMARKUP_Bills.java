import java.util.Scanner;

public class EIUMARKUP_Bills {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int product = sc.nextInt();
        long money = 0;
        for (int i = 200; i >= 180 && product > 0; i--, product -= 100) { // cho i la gia tien=> i>=180(dieu kien) & i=200( gia mac dinh)
            if (i > 180 && product >= 100) {
                money += 100 * i;
            } else if (i <= 180 || product < 100) {
                money += product * i;
            }
        }
        System.out.println(money);
    }
}