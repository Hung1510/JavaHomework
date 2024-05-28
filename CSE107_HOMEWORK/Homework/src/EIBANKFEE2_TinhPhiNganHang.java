import java.util.Scanner;

public class EIBANKFEE2_TinhPhiNganHang {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int bankaccount = sc.nextInt();
        double[] MonthlyFee = { 12, 7.5, 5, 0 };
        double[] CheckFee = { 0.2, 0.2, 0.1, 0 };
        long[] MoneyAmount = { 500, 2000, 5000, Long.MAX_VALUE };
        double FinalPayment = 0;
        double TotalCheck = 0;
        double sum = 0;
        var AccountMoney = new double[bankaccount];
        var Check = new double[bankaccount];
        var Payment = new double[bankaccount];
        for (int i = 0; i < bankaccount; i++) {
            AccountMoney[i] = sc.nextDouble();
            Check[i] = sc.nextDouble();
            loop: for (int k = 0; k < MoneyAmount.length; k++) {
                if (AccountMoney[i] < MoneyAmount[k]) {
                    Payment[i] = MonthlyFee[k] + (Check[i] * CheckFee[k]);
                    sum = sum + Payment[i];
                    TotalCheck = TotalCheck + Check[i];
                    break loop;
                }
            }
        }
        FinalPayment = sum / TotalCheck;
        System.out.println(Math.floor(FinalPayment * 1000) / 1000);
    }
}