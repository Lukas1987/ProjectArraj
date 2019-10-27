package sk.itsovy.mati.school;

public class Staff extends Person implements Employee {

    private String position;

    public Staff(String name, int age, String position) {
        super(name, age);
        this.position = position;
        System.out.println("I am staff");
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return 580;
    }
}
