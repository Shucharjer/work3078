
class Cop extends People {
    public String copID;
    public String belongTo;
    public String copLevel;
    public static int counter = 0;

    public Cop() {
        super.counter++;
        this.counter++;
    }

    public Cop(String ID, String name, String gender, String copID, String belongTo, String copLevel) {
        super.counter++;
        this.counter++;
        super.ID = ID;
        super.name = name;
        super.gender = gender;
        this.copID = copID;
        this.belongTo = belongTo;
        this.copLevel = copLevel;
    }

    public void zhiQin() {

    }

    public void exer() {

    }
}