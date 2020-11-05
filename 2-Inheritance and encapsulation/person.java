package week5;

public class person {

    protected String firstName;
    protected String secondName;
    protected int personId;
    private static int count = 0;

    public person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.personId = count++;
    }

    public String getFullName() {
        return getFullName(false);
    }

    public String getFullName(boolean reversed) {
        if (reversed) {
            return secondName + " " + firstName;
        } else {
            return firstName + " " + secondName;
        }
    }

    @Override
    public String toString() {
        return (firstName + " " + secondName + "-" + this.personId);
    }
}
