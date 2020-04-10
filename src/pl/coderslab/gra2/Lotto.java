package pl.coderslab.gra2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {

        int []randomNumbers=getRandomNumbers();

        System.out.println("Random numbers" + Arrays.toString(randomNumbers));

        int []yourNumbers=getYourNumbers();

        System.out.println("Your numbers:" + Arrays.toString(yourNumbers));
        //getYourNumbers();

        System.out.println("trafiles "+compareNumbers(randomNumbers, yourNumbers)+" liczby !!!\n GRATULACJE");

    }

    static int[] getRandomNumbers(){

        Random r=new Random();
        Scanner scan= new Scanner(System.in);
        int []luckyNumbers=new int[6];
        int []yourTicket=new int[6];

        for (int i = 0; i <= luckyNumbers.length-1; i++) {
            luckyNumbers[i]=r.nextInt(48)+1;
            //System.out.println(luckyNumbers[i]);
        }

        Arrays.sort(luckyNumbers);
        return luckyNumbers;
    }

    static int [] getYourNumbers(){

        int []yourNumbers=new int[6];
        Scanner scan= new Scanner(System.in);

        for (int i = 0; i <=yourNumbers.length -1 ; i++) {

            System.out.print("enter number "+(i+1)+":");
            while (!scan.hasNextInt()){
                scan.nextLine();
                System.out.println("must be a number, enter "+(i+1)+ " again:");
            }


            yourNumbers[i] = scan.nextInt();

            for (int j = 0; j <i ; j++) {
                if(yourNumbers[i]==yourNumbers[j]){
                    System.out.println("your ticket aleready contains this number");
                    i--;
                    break;
                }
            }

            if((yourNumbers[i]<1)||(yourNumbers[i]>49)) {
                i--;
                System.out.println("out of range 1-49");
            }


        }

        //System.out.println(Arrays.toString(yourNumbers));
        Arrays.sort(yourNumbers);
        return yourNumbers;
    }

    static int compareNumbers(int [] a,int []b){

        int counter=0;

        for (int i = 0; i <= a.length - 1; i++) {

            for (int j = 0; j <= b.length -1  ; j++) {

                if(a[i]==b[j]){
                    counter++;

                    System.out.println("trafiles "+a[i]);

                }
            }


        }


        return counter;
    }
}
