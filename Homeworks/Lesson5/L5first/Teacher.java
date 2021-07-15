package Homeworks.Lesson5.L5first;

public class Teacher extends human {
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Salary: " + salary);
    }
}
