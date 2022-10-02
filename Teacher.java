
public class Teacher extends People {
    public String teacherID;
    public String level;
    public String payNumber;
    public static int counter = 0;

    public Teacher() {
        super.counter++;
        this.counter++;
    }

    public Teacher(String ID, String name, String gender, String teacherID, String level, String payNumber) {
        super.counter++;
        this.counter++;
        super.ID = ID;
        super.name = name;
        super.gender = gender;
        this.teacherID = teacherID;
        this.level = level;
        this.payNumber = payNumber;
    }

    public void teachClass() {

    }

    public void correctingTests() {

    }
}