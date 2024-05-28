import java.util.Scanner;

class EIUPoint_DiemSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var scores = new int[] { 90, 85, 80, 75, 70, 65, 60, 55, 53, 52, 50, 0 };
        var gradeLetter = new String[] { "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F" };
        var grade = sc.nextInt();
        for (var i = 0; i < scores.length; i++) {
            if (grade >= scores[i]) {
                System.out.println(gradeLetter[i]);
                break;
            }
            sc.close();
        }
    }
}