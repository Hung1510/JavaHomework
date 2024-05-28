import java.util.Scanner;
class EIUSALES_ThuongTheoDoanhSo {
    public static Scanner sc = new Scanner(System.in);//second test hieu qua hon cai nay
    public static void main(String[] args) {
        int amount = sc.nextInt();
        double reward = calculateReward(amount);
        System.out.println(reward);
    }
    public static double calculateReward(int amount) {
        int values[] = { 0, 20, 50, 200, 500, 2000, Integer.MAX_VALUE };
        double rates[] = { 0.02, 0.03, 0.04, 0.05, 0.06, 0.07 };
        double reward = 0;
        for (int i = 0; i < values.length; i++) {
            if (amount > values[i]) {
                reward += (Math.min(amount, values[i + 1]) - values[i]) * rates[i];
            }
        }
        return reward;
    }
}