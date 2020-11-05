package week5;

public class RoboticsLab {
    private int isInFloor;

    public RoboticsLab(int isInFloor) {
        this.isInFloor = isInFloor;
    }

    public boolean isInFloor() {
        if (isInFloor < 1) {
            return (true);
        } else {
            return (false);
        }
    }
}