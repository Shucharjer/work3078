
public class uml {
    public static void main(String[] args) {
        Student student = new Student("田所浩二", "114514", "男", "19198", "软工", 10);
        System.out.println("我的名字是" + student.name + "。如你所见，我是一个" + student.gender + "生。我所在的班级是" + student.inClass
                + "我的身份证号、学号和成绩是" + student.ID + student.studentID + student.score);
        student.eating();
        student.walk();
        student.sleeping();
        student.haveClass();
        student.finishTest();

        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Teacher teacher = new Teacher();
        Cop cop = new Cop();
        System.out.println(
                "总共有" + People.counter + "个人。\n其中有" + student.counter + "个学生，" + teacher.counter + "个教师，"
                        + cop.counter + "个警察。");
    }
}