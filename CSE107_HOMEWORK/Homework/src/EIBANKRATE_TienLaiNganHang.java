import java.util.Scanner;
public class EIBANKRATE_TienLaiNganHang {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        double money =sc.nextLong();
        int month=sc.nextInt();
        double interest = money *(0.09/12.0)* month;
		System.out.println(interest + money);
    }
}
