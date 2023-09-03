package HomeWork1;

import java.util.Scanner;
//Please enter 1 four-digit natural number from the keyboard that falls within the
//range [1000 – 9999].
//Form 2 new two-digit numbers from the entered number:
//The first number is formed by the 1st and 4th digits.
//The second number is formed by the 2nd and 3rd digits.
//Compare the newly obtained two-digit numbers. Display an appropriate
//message.
public class Task6 {
    public static void main(String[] args) {
        int inputNumber;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 1 four-digit natural number from the keyboard that falls within the range " +
                "1000 – 9999");
        inputNumber = scan.nextInt();
        while (inputNumber < 1000 || inputNumber > 9999) {
            System.out.println("Please enter a valid number from 1000 to 9999");
            inputNumber = scan.nextInt();
        }
        scan.close();

        int digit1 = inputNumber / 1000;
        int digit2 = (inputNumber % 1000) / 100;
        int digit3 = (inputNumber % 100) / 10;
        int digit4 = inputNumber % 10;

        int number1 = (digit1 * 10) + digit4;
        int number2 = (digit2 * 10) + digit3;

        if (number1 > number2) {
            System.out.println(number1 + " > " + number2);
        } else if (number1 < number2) {
            System.out.println(number1 + " < " + number2);
        } else {
            System.out.println(number1 + " is equal to " + number2);
        }
    }
}
