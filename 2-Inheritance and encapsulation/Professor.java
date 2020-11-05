package week5;

public class Professor extends person {

    private int yearsOfExperience;

    public Professor(String firstName, String secondName, int yearsOfExperience) {
        super(firstName, secondName);
        this.yearsOfExperience = yearsOfExperience;
    }

    public boolean isExperienced() {
        if (yearsOfExperience > 5) {
            return (true);
        } else {
            return (false);
        }
    }

}
