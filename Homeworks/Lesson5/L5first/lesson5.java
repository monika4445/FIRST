package Homeworks.Lesson5.L5first;

import java.util.Scanner;

public class lesson5 {
    public static void main(String[] args) {
        int x = 4;
        byte b = (byte) x;
        System.out.println(b);

        int xx = 128;
        byte bb = (byte) xx;
        System.out.println(bb);
        byte c = (byte) (b + 1);
        float ff = 456.4f;
        int f = (int) ff;
        System.out.println(f);

        String s = "12";
        int ss = Integer.parseInt(s);
        System.out.println(ss + 1);

        Scanner cc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int h = cc.nextInt();
        System.out.println(h + 1);

        System.out.println();

        People hh = new People();
        System.out.println("Enter your name");
        String name = cc.next();
        System.out.println("Enter your age");
        int age = cc.nextInt();
        System.out.println("Are you from Armenia?");
        boolean ccc = cc.nextBoolean();

        hh.setName(name);
        hh.setAge(age);
        hh.setArmenian(ccc);

        hh.printInfo();

        People Peoplej = new People();
        System.out.println(Peoplej.getAge());
        System.out.println(Peoplej.getName());

        Car n = new Car("32AA322");


        Student student = new Student();
        student.setName("Hayk");
        student.setYear(2005);
        student.setGrade(18.5);
        student.setPhone("369885");

        Teacher teacher = new Teacher();
        teacher.setName("Anahit");
        teacher.setYear(1995);
        teacher.setSalary(5000);
        teacher.setPhone("256514");

        student.printInfo();
        System.out.println("-------------------------");
        teacher.printInfo();


    }
}
