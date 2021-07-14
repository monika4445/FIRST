package Homeworks.Lesson4;

public class Lesson4 {
    public static void main(String[] args) {
        System.out.println("Sorting array elements using bubble sort");

        int a[] = {3, 61, 32, 7, 45, 322, 5};
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                //swap elements
                int b = a[i];
                a[i] = a[i + 1];
                a[i + 1] = b;
            }
            System.out.print(a[i] + " ");
        }
        System.out.println();

        TumoStudent TumoStudent1 = new TumoStudent();
        TumoStudent1.firstName = "Ani";
        TumoStudent1.lastName = "Grigoryan";
        TumoStudent1.age = 21;
        TumoStudent1.isFromArmeniaOrArtsakh = true;
        TumoStudent1.language = '\u0540';
        System.out.println(TumoStudent1.language);

        System.out.println();

        TumoStudent TumoStudent2 = new TumoStudent();
        TumoStudent2.firstName = "Vlad";
        TumoStudent2.lastName = "Isakov";
        TumoStudent2.age = 13;
        TumoStudent2.isFromArmeniaOrArtsakh = false;
        TumoStudent2.language = '\u0420';
        System.out.println(TumoStudent2.firstName + " " + TumoStudent2.lastName);

        System.out.println();

        TumoStudent TumoStudent3 = new TumoStudent();
        TumoStudent3.firstName = "Anahit";
        TumoStudent3.lastName = "Arstamyan";
        TumoStudent3.age = 14;
        TumoStudent3.isFromArmeniaOrArtsakh = true;
        TumoStudent3.language = '\u0540';
        System.out.println(TumoStudent3.firstName + " " + TumoStudent3.lastName + " is " + TumoStudent3.age + " years old");

        System.out.println();

        System.out.println(TumoStudent3.age > TumoStudent2.age ? TumoStudent3.firstName : TumoStudent2.firstName);

        System.out.println();

        if (TumoStudent2.isFromArmeniaOrArtsakh && (TumoStudent2.age >= 12 || TumoStudent2.age <= 18)) {
            System.out.println(" You can become a TUMOian. All you have to do is Register in advance.");
        } else {
            System.out.println("Sorry you can not become a TUMOian");
        }
        System.out.println();

        System.out.println(TumoStudent3.isFromArmeniaOrArtsakh && (TumoStudent3.age >= 12 || TumoStudent3.age <= 18) ? " You can become a TUMOian. All you have to do is Register in advance." : "Sorry you can not become a TUMOian");

        System.out.println();

        if (TumoStudent1.age >= 18 || TumoStudent1.age <= 28) {
            System.out.println(TumoStudent1.firstName + " " + TumoStudent1.lastName + " can participate special workshops for young people in Tumo");
        } else {
            System.out.println("Unfortunately" + TumoStudent1.firstName + " " + TumoStudent1.lastName + " can not participate special workshops in Tumo");
        }
        System.out.println();

        if (TumoStudent1.isFromArmeniaOrArtsakh)
            System.out.println(TumoStudent1.firstName + " " + TumoStudent1.lastName);
        else {
            System.out.println("Sorry you aren't from Armenia or Artsakh, so you can't participate special workshops");
        }


    }
}