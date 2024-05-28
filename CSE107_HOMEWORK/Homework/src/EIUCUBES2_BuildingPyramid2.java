import java.util.Scanner;

public class EIUCUBES2_BuildingPyramid2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            long numberBricks = sc.nextLong();
            double height = Math.floor(Math.cbrt(numberBricks * 6)); // cbrt:root // nhân 6 để bằng kết quả của ví dụ
            double brickse = (height * (height + 1) * (height + 2) / 6);
            if (brickse > numberBricks) {
                System.out.print((int) height - 1 + " ");
            } else
                System.out.print((int) height + " ");
        }
        sc.close();
    }
}
// 10 106 999 957 24 873 571 658 248 173 600
// 7 17 16 4 16 14 14 10 9 14
