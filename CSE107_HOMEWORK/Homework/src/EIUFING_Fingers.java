import java.util.Scanner;

public class EIUFING_Fingers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        number = number % 18;
        if (number > 19) {
            number = number % 18;
        }
        if (number > 10) {
            number = 20 - number;
        }
        if (number == 1) {
            System.out.println("Ngon cai cua ban tay trai");
        }
        if (number == 2) {
            System.out.println("Ngon tro cua ban tay trai");
        }
        if (number == 3) {
            System.out.println("Ngon giua cua ban tay trai");
        }
        if (number == 4) {
            System.out.println("Ngon ap ut cua ban tay trai");
        }
        if (number == 5) {
            System.out.println("Ngon ut cua ban tay trai");
        }
        if (number == 10) {
            System.out.println("Ngon cai cua ban tay phai");
        }
        if (number == 9) {
            System.out.println("Ngon tro cua ban tay phai");
        }
        if (number == 8) {
            System.out.println("Ngon giua cua ban tay phai");
        }
        if (number == 7) {
            System.out.println("Ngon ap ut cua ban tay phai");
        }
        if (number == 6) {
            System.out.println("Ngon ut cua ban tay phai");
        }
        sc.close();
    }
}