import java.util.Scanner;
public class EIDiscount2_Chiet_Khau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long money = sc.nextLong();
        long[] level = {0,50000000,20000000,100000000,300000000,600000000,900000000};
        double[] Discrate = {1,0.97,0.95,0.93,0.9,0.88,0.85};
        long[] moneyAfterDiscount = {0, 5_000_000, 19_550_000, 95_550_000, 281_550_000, 551_550_000, 815_550_000};
        for (int i = level.length-1; i >= 0;i-- ) {
            if (money > level[i]) {
                System.out.println(moneyAfterDiscount[i] + (long)  ((money-level[i])*Discrate[i]));
                break;
            }
        }
        sc.close();
    }
}

