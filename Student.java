public class Student extends People {
    public String studentID;
    public String inClass;
    public int score;
    public static int counter = 0;

    public Student() {
        super.counter++;
        this.counter++;
    }

    public Student(String ID, String name, String gender, String studentID, String inClass, int score) {
        super.counter++;
        this.counter++;
        super.ID = ID;
        super.name = name;
        super.gender = gender;
        this.studentID = studentID;
        this.score = score;
    }

    public void haveClass() {
        System.out.println("我可以上课");
    }

    public void finishTest() {
        System.out.println("我可以考试");
    }
}
