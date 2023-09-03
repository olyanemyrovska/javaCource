package HomeWork1;

import java.util.Scanner;
//    Please enter 3 numbers from the console (keyboard) - A, B and C.
//Swap their values in such a way that A takes B's value, B takes C's value and C
//takes A's old value.

public class Task4 {

    public static void main(String[] args) {
        int a, b, c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number A");
        a = scan.nextInt();
        System.out.println("Enter the second number B");
        b = scan.nextInt();
        System.out.println("Enter the third number C");
        c = scan.nextInt();
        scan.close();

        int tmp = a;
        a = b;
        b = c;
        c = tmp;

        System.out.println("New value of A is: " + a);
        System.out.println("New value of B is: " + b);
        System.out.println("New value of C is: " + c);
    }
}

