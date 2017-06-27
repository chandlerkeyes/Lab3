package com.company;
import java.util.Scanner;
public class Lab3 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int userInput = 0;
        char yOrN = ' ';
        String spaces = "       ";
        do {
            System.out.println("Learn your squares and cubes!");
            System.out.println();
            System.out.println("Enter an integer:");
            userInput = keyboard.nextInt();

            System.out.println();
            System.out.println("Number" + spaces + "Squared" + spaces + "Cubed");
            System.out.println("======" + spaces + "=======" + spaces + "======");

            for (int i = 1; i <= userInput; i++) {
                int squared = (int) Math.pow(i, 2);
                int cubed = (int) Math.pow(i, 3);
                //System.out.println(String.format("%-5d %8d %13d %2d ", i, squared, cubed));
                String format = "%-12s %-13s %-1s";
                System.out.println(String.format(format, i, squared, cubed));
            }
            System.out.println("Continue? (y/n)");
            yOrN = keyboard.next().charAt(0);
        } while ((yOrN == 'y') || (yOrN == 'Y'));
    }
}
