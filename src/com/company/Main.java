package com.company;
import java.util.Random;
import java.util.Scanner;

/**
 * A program that can auto generate complements using the random function.
 *
 * Author: Nate Anderson
 * Version: 0.2
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

        // CHECKS THE INPUT
        while (!"done".equals(input)) {
            if (input.equals("complements")) {
                if (select1 >= 30 && select1 <= 40) {
                    System.out.println("You are amazing!");
                } else {
                    System.out.println("tests lol");
                }
            } else {
                System.out.println("Please try typing again! Don't worry, spelling is hard for me tooo");
            }
        }



    }
}
