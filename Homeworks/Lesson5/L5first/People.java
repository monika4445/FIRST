package Homeworks.Lesson5.L5first;

public class People {
    public String name;
    public int age;
    public boolean isArmenian;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isArmenian() {
        return isArmenian;
    }

    public void setArmenian(boolean armenian) {
        isArmenian = armenian;
    }

    public void printInfo() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("is Armenian: " + isArmenian);
    }

    public void People(String name, int age) {
        this.name = name;
        this.age = age;
        return;
    }
}











