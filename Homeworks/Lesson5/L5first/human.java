package Homeworks.Lesson5.L5first;

public class human {
    private String name;
    private int year;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String phone;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Year: " + year);
        System.out.println("Phone: " + phone);

    }
}
