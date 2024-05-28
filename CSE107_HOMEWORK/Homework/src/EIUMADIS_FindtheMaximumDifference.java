import java.util.*;

public class EIUMADIS_FindtheMaximumDifference {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextLong();
        long min = a[0];
        long maxgap = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > min) {
                long gap = a[i] - min;
                if (gap > maxgap)
                    maxgap = gap;

            } else
                min = a[i];
        }
        System.out.println(maxgap);
    }
}
