package sk.itsovy.mati.school;

public class Teacher extends Person implements Employee {

    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
        System.out.println("I am teacher");
    }

    @Override
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
