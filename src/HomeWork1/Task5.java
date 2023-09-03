package HomeWork1;
//Please enter 3 variables from the keyboard - time (integer type), amount of
//money (floating point number), am I at work (boolean type).
//Write a program that makes a decision based on the data entered by the user in
//the following way:
//If I'm at work, I'll be working and won't be able to go out.
//If it's a day and I have more than 10$. I will go to the cinema.
//If it's a day and I have less than 10$. or I don't have money, I'll go for a
//walk.
//If it is night and I have more than 20$. I will go to a disco.
//If it's night and I have less than 20$. I will go to sleep.
//Display the solution as a message in the console.

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int time;
        double amountOfMoney;
        boolean amIAtWork;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the current time (from 1 to 24)");
        time = scan.nextInt();
        while (time > 24 || time < 1) {
            System.out.println("Please enter valid time from 1 to 24");
            time = scan.nextInt();
        }
        System.out.println("The amount of money I have:");
        amountOfMoney = scan.nextDouble();
        System.out.println("I am at work: (true/false)");
        amIAtWork = scan.nextBoolean();
        scan.close();

        boolean isDay = time >= 6 && time <= 18;

        if (amIAtWork) {
            System.out.println("I'm mot going out");
        } else if (isDay && amountOfMoney > 10.0d) {
            System.out.println("I'm going to the cinema");
        } else if (isDay && amountOfMoney <= 10.0d) {
            System.out.println("I'm going for a walk");
        } else if (!isDay && amountOfMoney > 20.0d) {
            System.out.println("I'm going to a disco");
        } else if (!isDay && amountOfMoney <= 20.0d) {
            System.out.println("I'm going to sleep");
        }
    }
}
