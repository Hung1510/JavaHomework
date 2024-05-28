import java.util.ArrayList;
import java.util.Scanner;

public class EIAUCTION_BlackFriday {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(); // group size
        ArrayList<Integer> person = new ArrayList<>(n); // each person
        ArrayList<Integer> outcome = new ArrayList<>(); // roll outcome
        for (int i = 0; i < n; i++)
            person.add(sc.nextInt());
        for (int i = 0; i < person.size(); i++) {
            if (unique(person.get(i), person) == 1)
                outcome.add(person.get(i));
        }
        outcome.sort((o0, o1) -> o1 - o0);
        if (outcome.size() != 0) {
            for (int i = 0; i < person.size(); i++)
                if (person.get(i) == outcome.get(0))
                    System.out.println(i + 1);
        } else
            System.out.println("none");
    }

    public static int unique(int x, ArrayList<Integer> person) {
        int UniqueCount = 0;
        for (int i = 0; i < person.size(); i++) {
            if (person.get(i) == x)
                UniqueCount++;
        }
        return UniqueCount;
    }
}
//8
//1 1 1 5 3 4 6 6
//output 4
