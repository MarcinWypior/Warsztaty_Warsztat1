package pl.coderslab.gra3;

import java.util.Random;
import java.util.Scanner;

public class Zgadywanie_liczb2 {
    public static void main(String[] args) {
        System.out.println("think about number in range 1 - 1000 and i will try to guess in 10 attempts");
        int min = 0;
        int max = 1000;
        int attempts = 0;
        int quess = ((max - min) / 2) + min;
        System.out.println("I guess that searched number is " + quess+"  ");

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("more or less \n");
            String moreOrLess = scan.nextLine();

            if((!moreOrLess.equals("more")) && (!moreOrLess.equals("less")) && !moreOrLess.equals("you guessed")) {
                System.out.print("wrong answer.");
            }

            if(attempts >= 10) {
                System.out.println("more than 10 attempts, probably you are cheating");
                break;
            }

            if(moreOrLess.equals("you guessed")) break;
            if(moreOrLess.equals("less")) {
                max = quess;
                quess = ((max - min) / 2) + min;
                attempts++;
                System.out.print("i guess your number is " + quess);
            }

            if(moreOrLess.equals("more")) {
                min = quess;
                quess = ((max - min) / 2) + min;
                attempts++;
                System.out.print("i guess your number is " + quess);
            }

            System.out.println("it`s called artificial intelligence");
        }
    }
}
