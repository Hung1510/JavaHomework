import java.util.Scanner;

public class EIGROSS_LuongTruocThue {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int people = sc.nextInt();
        double salary[] = new double[people];
        for (int i = 0; i < people; i++) {
            salary[i] = sc.nextDouble();
            double tax = salary[i] / 9;
            System.out.printf("%.2f", tax);
            System.out.println();
        }
    }
}