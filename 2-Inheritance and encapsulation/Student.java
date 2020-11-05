package week5;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student extends person {

    private Date dateOfBirth;

    public Student(String name1, String name2, Date dateRepresentation) {
        super(name1, name2);
        this.dateOfBirth = dateRepresentation;
    }

    @Override
    public String toString() {
        return super.toString() + dateOfBirth.toString();
    }

    public int getAge() {
        Date x = new Date();
        DateFormat df = new SimpleDateFormat("yyyy");
        int diff = Integer.parseInt(df.format(x)) - dateOfBirth.getYear();
        return diff;
    }
}
