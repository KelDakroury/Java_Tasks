package week5;

public class Employee extends person {

    private int OfficeNumber;

    public Employee(String firstName, String secondName, int personId, int ID, int OfficeNumber) {
        super(firstName, secondName);
        this.OfficeNumber = OfficeNumber;
    }

    public boolean getOfficeNumber() {
        if (OfficeNumber > 0) {
            return (true);
        } else {
            return (false);
        }
    }
}
