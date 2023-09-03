package HomeWork1;

import java.util.Scanner;

//Please enter an integer from the keyboard in the range [0-100].
//Based on the number entered, print a message in the console about how likely it
//is to rain. Business logic should be based on the following intervals:
//0 – it will not rain
//Between 0 and 5 - minimal chance of precipitation
//Between 5 and 20 - a small chance of precipitation
//Between 20 and 50 - there is a chance of precipitation
//Between 50 and 80 - high chance of precipitation
//Between 80 and 100 - it will rain
public class Task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputNumber;
        do {
            System.out.println("Please enter an integer from the keyboard in the range [0-100]");
            inputNumber = scan.nextInt();
        } while (inputNumber < 0 || inputNumber > 100);

        if (inputNumber == 0) {
            System.out.println("It will not rain.");
        } else if (inputNumber <= 5) {
            System.out.println("Minimal chance of precipitation.");
        } else if (inputNumber <= 20) {
            System.out.println("A small chance of precipitation.");
        } else if (inputNumber <= 50) {
            System.out.println("There is a chance of precipitation.");
        } else if (inputNumber <= 80) {
            System.out.println("High chance of precipitation.");
        } else {
            System.out.println("It will rain.");
        }
        scan.close();
    }
}
