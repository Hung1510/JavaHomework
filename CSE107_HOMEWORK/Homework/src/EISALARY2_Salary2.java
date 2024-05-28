import java.util.Scanner;
 
public class EISALARY2_Salary2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int people = sc.nextInt();
        double[] hours = new double[5];
        double hourOffice = 0;
        double hourOvertime = 0;
        double SumOfficeSalary = 0;
        double SumOvertimeSalary = 0;
        for (int i = 0; i < people; i++) {
            double PersonSalary = 0;
            for (int j = 0; j < 5; j++) {
                hours[j] = sc.nextDouble();
            }
            double HourlyWage = sc.nextDouble();
            for (int j = 0; j < 5; j++) {
                if (hours[j] > 8) {
                    PersonSalary += ((hours[j] - 8) * 1.5 + 8) * HourlyWage;
                    hourOvertime += hours[j] - 8;
                    hourOffice += 8;
                    SumOfficeSalary += 8 * HourlyWage;
                    SumOvertimeSalary += ((hours[j] - 8) * 1.5) * HourlyWage;
                } else {
                    PersonSalary += hours[j] * HourlyWage;
                    hourOffice += hours[j];
                    SumOfficeSalary += hours[j] * HourlyWage;
                }
            }
            sb.append(PersonSalary).append("\n");
        }
        sb.append((double) Math.round(SumOfficeSalary / hourOffice * 100)/ 100).append("\n");
        sb.append((double) Math.round(SumOvertimeSalary / hourOvertime * 100)/ 100);
        System.out.println(sb);
        sc.close();
    }
}
