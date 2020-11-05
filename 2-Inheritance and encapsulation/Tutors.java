package week5;

public class Tutors extends person {

    private int numberOfAwards;

    public Tutors(String firstName, String secondName, int personId, int ID, int numberOfAwards) {
        super(firstName, secondName);
        this.numberOfAwards = numberOfAwards;
    }

    public boolean isAwarded() {
        return numberOfAwards >= 3;
    }
}
