package Homeworks;

public class Lesson2 {
    public static void main(String[] args) {
        int a = 13, b = 2;
        System.out.println(a + b);
        System.out.println(a - b);
        int c = a * b;
        System.out.println(c);
        int x = a / b;
        System.out.println(x);
        double xx = a / b;
        System.out.println(xx);
        int cc = a % b;
        System.out.println(cc);
        a++;
        System.out.println(a);
        a += 5;
        System.out.println(a);
        a = 19;
        b = a++;
        System.out.println("a = " + a + " b = " + b);
        int e = 8;
        int h = 19;
        int hh = ++e + h--;
        System.out.println(++e);
        System.out.println(--hh);
        System.out.println(++h + e--);
        System.out.println("e = " + e + " h = " + h + ", hh = " + hh);

        boolean isA5 = a == 5;
        System.out.println(isA5);
        boolean bIsNot7 = b != 3;
        System.out.println(bIsNot7);
        System.out.println(a > 17);
        System.out.println(b <= 19);
        boolean CC = a == 14 && b != 3;
        System.out.println(CC);
        System.out.println(16 | 3);
        System.out.println(14 ^ 2);

        int[] _a = new int[5];
        System.out.println(_a[0]);
        _a[0] = 8;
        _a[4] = 14;
        System.out.println(_a[0]);
        System.out.println(_a.length);
        System.out.println(_a[_a.length - 1]);

        int[] _b = new int[]{6, -7, 9, 4, 18};
        System.out.println(_b[0] + _b[_b.length - 2]);
        int[][] z = {{2, 3}, {4, 9}, {14, 6}};
        System.out.println(z[2][0]);

        String B;
        if (a % 2 == 0) {
            B = "Zuyg";

        } else {
            B = "kent";
        }
        System.out.println(B);
        int g = 8;
        String u = g % 2 == 0 ? "zuyg" : "kent";
        System.out.println(u);
        String k = a > 0 ? "positive" : (a < 0 ? "negative" : "zero");
        System.out.println(k);
        String kk = a > 5 ? "ayo" : "voch";
        System.out.println(kk);

        // Task 1. print yes if jj is power of 2, else print no
        int jj = 32;
        System.out.println((jj & (jj - 1)) == 0 ? "Yes" : "No");
    }
}
