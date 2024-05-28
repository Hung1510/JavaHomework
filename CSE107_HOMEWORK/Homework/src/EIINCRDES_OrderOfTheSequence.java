import java.util.*;

public class EIINCRDES_OrderOfTheSequence {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int arraylength = sc.nextInt();
        int[] arrayelements = new int[arraylength];
        for (int i = 0; i < arraylength; i++) {
            arrayelements[i] = sc.nextInt();
        }
        boolean isIncreasing = true;
        boolean isDecreasing = true;
        for (int i = 1; i < arraylength; i++) {
            if (arrayelements[i] <= arrayelements[i - 1]) {
                isIncreasing = false;
            }
            if (arrayelements[i] >= arrayelements[i - 1]) {
                isDecreasing = false;
            }
        }
        if (isIncreasing) {
            System.out.println("increasing");
        } else if (isDecreasing) {
            System.out.println("decreasing");
        } else {
            System.out.println("none");
        }
    }
}
