package com.company;
import java.util.Random;
import java.util.Scanner;

/**
 * A program that can auto generate complements using the random function.
 *
 * Author: Nate Anderson
 * Version: 0.6
 */

public class Main {
    public static void main(String[] args) {
        // CREATES SCANNER OBJECT
        Scanner in = new Scanner(System.in);

        // CREATES THE RANDOM OBJECT
        Random ran = new Random();

        // SETS BOUNDARIES FOR AND DECIDES THE RANDOM NUMBER
        int top = 100;
        int bottom = 10;
        int select1 = ran.nextInt(top - bottom) + bottom;

        // PRINTS OUT A NICE WELCOME MESSAGE
        System.out.println("Hello! I have made this program to auto-generate complements just for you!");
        System.out.println("I hope you have a great day!");

        // PRINTS OUT INSTRUCTIONS AND GETS INPUT
        System.out.println("Please enter the word \"complements\" to see your complement!");
        String input = in.next();

        // LOOPS THE CODE UNTIL "DONE" IS ENTERED
        while (!"done".equals(input)) {
            // CHECKS THE INPUT
            if (input.equals("complements")) {
                // PRINTS THE COMPLEMENTS BASED ON THE RANDOM NUMBER
                if (select1 >= 10 && select1 <= 20) {
                    System.out.println("You are amazing!");
                } else if (select1 >= 21 && select1 <= 30) {
                    System.out.println("You are the most pretty person in the room!");
                } else if (select1 >= 31 && select1 <= 40) {
                    System.out.println("You are hilarious!!");
                } else if (select1 >= 41 && select1 <= 50) {
                    System.out.println("I love you for who you are!");
                } else if (select1 >= 51 && select1 <= 60) {
                    System.out.println("You make me so happy!!");
                } else {
                    System.out.println(":)");
                }
            // PRINTS AN ERROR MESSAGE IF THE INPUT IS INCORRECT
            } else {
                System.out.println("Please try typing again! Don't worry, spelling is hard for me tooo");
            }

            // RE-ROLLS THE RANDOM NUMBER IN PREPARATION FOR ANOTHER COMPLEMENT
            select1 = ran.nextInt(top - bottom) + bottom;

            // ASKS IF THE USER WOULD LIKE ANOTHER COMPLEMENT AND IF NOT TO TYPE "DONE"
            System.out.println("Would you like to get another complement?");
            System.out.println("If yes type \"complements\" if not, type \"done\"");

            // GETS THE INPUT
            input = in.next();
        }
    }
}
