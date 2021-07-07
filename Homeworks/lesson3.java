package Homeworks;

public class lesson3 {
    public static void main(String[] args) {
        System.out.println("Task 1.1 Create an array and fill it with 2 number.");
        int[] array = {2, 2, 2, 2, 2};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        {System.out.println("Task 1.2 Create an array and fill it with 2 number.");
        int [] arr1= new int[7];
            for (int i = 0; i < arr1.length; i++) {
                arr1[i]= 2;
                System.out.print(arr1[i]+ " ");
            }

        }
        {
            System.out.println("\nTask 2.1 Create an array and fill it with numbers from 1:1000.");
            for (int i = 1; i <= 1000; i++) {
                System.out.println(i);
            }
        }
        System.out.println();
        {System.out.println("\nTask 2.2 Create an array and fill it with numbers from 1:1000.");
            int[] arr2= new int [1000];
        for (int i = 0; i < arr2.length; i++) {
            arr2 [i]= i+1;
            System.out.println(arr2[i]);
        }}
        {
            System.out.println("\nTask 3. Create an array and fill it with odd numbers from -20:20.");
            for (int i = -20; i <= 20; i++) {
                if (i % 2 != 0)
                    System.out.print(i + " ");
            }
        }
        System.out.println();

        {
            System.out.println("\nTask 4. Create an array and fill it. Print all elements which can be divided by 5.");
            int[] c = {-6, 15, 35, 1, 7, 40};
            for (int i = 0; i < c.length; i++) {
                if (c[i] % 5 == 0) {
                    System.out.print(c[i] + " ");
                }
            }
        }
        System.out.println();
        {
            System.out.println("\nTask 5. Create an array and fill it. Print all elements which are between 24.12 and 467.23.");
            double[] z = {2.5, 60.47, 39.19, 10.6, 219.31, 155.3};
            for (int i = 0; i < z.length; i++) {
                if (z[i] >= 24.12 && z[i] <= 467.23) {
                    System.out.print(z[i] + "  ");
                }
            }
        }
        System.out.println();
        {
            System.out.println("\nTask 6. Create an array and fill it. Print count of elements which can be divided by 2.");
            int[] numarray = {5, 6, 75, 91, 14, 3, 18, 44, 62};
           //or int count= 0
            int b = 0;
            for (int i = 0; i < numarray.length; i++) {
                if (numarray[i] % 2 == 0)
                    b++;
            }
            System.out.println(b);
        }
        System.out.println();
        {
            System.out.println("\nTask 7. Given an integer, 0 < N < 21, print its first 10 multiples.  \n" + " Each multiple Nx i (where 0 <i< 11) should be printed on a new line in the form: N x i = result.\n");
            int N = 7;
            for (int i = 1; i < 11; i++) {
                System.out.println(N + " x  " + i + " = " + N * i);
            }


        }
    }
}
