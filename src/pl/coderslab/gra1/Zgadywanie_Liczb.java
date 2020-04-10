package pl.coderslab.gra1;

import java.util.Random;
import java.util.Scanner;

public class Zgadywanie_Liczb {

    public static void main(String[] args) {
        Random r=new Random();
        Scanner scan= new Scanner(System.in);

        int attemptCounter=0;
        int currentAttempt=1;
        int numberToGuess=r.nextInt(99)+1;

        System.out.println("liczba do odgadniecia: "+numberToGuess);

        System.out.println("odgadnij liczbe");
        while (scan.hasNext()) {

            try {
                currentAttempt=Integer.parseInt(scan.next());
            } catch (NumberFormatException e) {
                System.out.println("ogarnij sie zly format");
                return;
            }


            if(currentAttempt==numberToGuess){
                System.out.println("odgadles prawidlowo");
                break;
            }
            else if(currentAttempt<numberToGuess){
                System.out.println("za malo");
            }else if(currentAttempt>numberToGuess){
                System.out.println("za duzo");
            }
            attemptCounter++;
        }


        System.out.println("odgales "+ currentAttempt + " po "+attemptCounter+" podejsciach");
    }
}
