package HomeWork1;

import java.util.Scanner;

//Read (as input) 3 numbers from the keyboard: A, B & C. The numbers are with
//        floating point (double).
//        Check whether the number C is between A and B.
//        As output, you must display to the user an appropriate message about whether
//        the number C is between the numbers A and B.
//        Example:
//        Input:
//        A = 38.4
//        B = 85.3
//        C = 67.8
//        Output:
//        Number 67.8 is between 38.4 and 85.3
public class Task1 {

    public static void main(String[] args) {
        double a, b, c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number A:");
        a = scan.nextDouble();
        System.out.println("Enter the second number B:");
        b = scan.nextDouble();
        System.out.println("Enter the third number C:");
        c = scan.nextDouble();
        scan.close();

        if (c > a && c < b) {
            System.out.println(String.format("Number %s is between %s and %s.", c, a, b));
        } else {
            System.out.println(String.format("Number %s is not between %s and %s.", c, a, b));
        }
    }
}