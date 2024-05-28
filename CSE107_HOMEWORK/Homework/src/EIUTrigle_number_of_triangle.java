import java.util.Arrays;
import java.util.Scanner;

public class EIUTrigle_number_of_triangle {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] lengthofside = new int[n];
        for (int i = 0; i < n; i++)
        lengthofside[i] = sc.nextInt();
        countTriangle(lengthofside);
    }

    public static void countTriangle(int[] lengthofside) {
        Arrays.sort(lengthofside);
        int count = 0;
        for (int i = 0; i < lengthofside.length; i++)
            for (int j = i + 1; j < lengthofside.length; j++)
                for (int k = j + 1; k < lengthofside.length; k++)
                    if (lengthofside[i] + lengthofside[j] > lengthofside[k])
                        count++;
        System.out.println(count);
    }
}