package Homeworks.Lesson5.L5first;

public class Student extends human {
    private double grade;

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }


    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Grade: " + grade);
    }
}












