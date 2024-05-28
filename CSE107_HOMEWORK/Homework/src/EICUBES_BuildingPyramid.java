import java.util.Scanner;

public class EICUBES_BuildingPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int brick = sc.nextInt();
        int n = 1;
        int layer = 0;
        while (brick >= n * (n + 1) / 2) {
            brick -= n * (n + 1) / 2;
            n++;
        }
        layer = n - 1;
        System.out.println(layer);
        sc.close();
    }
}
