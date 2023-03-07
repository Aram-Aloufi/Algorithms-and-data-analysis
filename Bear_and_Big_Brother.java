package rahaf;

import java.util.Scanner;

public class Bear_and_Big_Brother {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a, b;
        a = input.nextInt();
        b = input.nextInt();
        int thr = 3;
        int two = 2;
        int cunt = 0;
        if (a == 1 && b == 1) {
            System.out.print("1xx");
            System.exit(0);
        }
        while (a < b || a == b) {
            a *= thr;
            b *= two;
            cunt++;
        }
        System.out.print(cunt);

    }

}
