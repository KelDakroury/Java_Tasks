package week5;

import java.time.LocalDate;
import java.util.*;

public class RunWeek5 {

    public static void main(String[] args) {
        String[] tmp = {"Mark", "Sam", "Alex", "Kamil", "Zack", "David", "Lev", "Eren", "Kirito",
            "Rayan", "Kiril", "Max", "Daniel", "Bill", "Jasson", "Armin", "Kirigaya", "Kazato", "Anton", "Chung"};
        List<String> Names = (new ArrayList<String>(Arrays.asList(tmp)));
        ArrayList<person> people = new ArrayList<>();
        int x = (int) (Math.random() * 10);
        int cnt = 20;
        System.out.println(x);
        while (x != 0) {
            int mat = (int) (Math.random() * 2);
            if (mat == 1) {
                int years = (int) (Math.random() * 6) + 1;
                int firstName = (int) (Math.random() * cnt);
                String Name1 = Names.get(firstName);
                Names.remove(Name1);
                cnt--;
                int secondName = (int) (Math.random() * cnt);
                String Name2 = Names.get(secondName);
                cnt--;
                Names.remove(Name2);
                people.add(new Professor(Name1, Name2, years));
            } else {

                int firstName = (int) (Math.random() * cnt);
                String Name1 = Names.get(firstName);
                Names.remove(Name1);
                cnt--;
                int secondName = (int) (Math.random() * cnt);
                String Name2 = Names.get(secondName);
                cnt--;
                Names.remove(Name2);
                Calendar cal = Calendar.getInstance();
                cal.set(Calendar.YEAR, (int) (Math.random() * 5 + 1998));
                cal.set(Calendar.MONTH, (int) (Math.random() * 11));
                cal.set(Calendar.DAY_OF_MONTH, (int) (Math.random() * 27 + 1));
                Date dateRepresentation = cal.getTime();
                people.add(new Student(Name1, Name2, dateRepresentation));
            }
            x--;
        }
        int Professors = 0, Students = 0;
        for (person z : people) {
            if (z instanceof Professor) {
                Professors++;
                System.out.println("Professor " + z.getFullName());
            } else {
                Students++;
                System.out.println("Student " + z.getFullName());
            }
        }
        System.out.print("There are " + Professors + " Professors and " + Students + " Students.\n");
    }
}
