package pl.coderslab.gra2;

import java.util.*;

public class Lotto {
    public static void main(String[] args) {

        Integer[]allNumbers=new Integer[49];

        for (int i = 0; i <=allNumbers.length -1; i++) {
            allNumbers[i]=i+1;
        }

        Collections.shuffle(Arrays.asList(allNumbers));
        Integer [] luckyNumbers=Arrays.copyOf(allNumbers,6);
        Arrays.sort(luckyNumbers);
        System.out.println("winning numbers are:" + Arrays.toString(luckyNumbers));
        List <Integer> myNumbers=new ArrayList<>();
        Scanner sc=new Scanner(System.in);

        System.out.println("which numbers do you bet ? \nenter 6 numbers");

        for (int i = 0; i <6 ; i++) {

            Integer buffer;
            System.out.println("enter number "+(i+1));
            while (!sc.hasNextInt()) {
                System.out.println("zly format");
                sc.nextLine();
            }
            buffer=sc.nextInt();

            if((buffer>49)||(buffer<1)){
                System.out.println("number out of range 1 - 49");
                i--;
            }


            if(!myNumbers.contains(buffer)) {
                myNumbers.add(buffer);
            }else {
                i--;
                System.out.println("this number is aleredy on your ticket");
            }
        }

        Collections.sort(myNumbers);
        System.out.println(myNumbers.toString());


        int counter=0;
        for (Integer n:luckyNumbers
        ) {

            if(myNumbers.contains(n)){
                counter++;
                System.out.println("you guessed number: "+ n);
            }
        }

        if(counter>=3)
            System.out.println("you guesst "+counter+" numbers");
    }
}

//wersja na tablicach bez list
//import java.util.Arrays;
//import java.util.Random;
//import java.util.Scanner;
//
//public class Lotto {
//    public static void main(String[] args) {
//
//        int []randomNumbers=getRandomNumbers();
//        System.out.println("Random numbers" + Arrays.toString(randomNumbers));
//
//        int []yourNumbers=getYourNumbers();
//        System.out.println("Your numbers:" + Arrays.toString(yourNumbers));
//
//        if(compareNumbers(randomNumbers, yourNumbers)>3){
//            System.out.println("You matched "+compareNumbers(randomNumbers, yourNumbers)+" numbers correctly !!!\n CONGRATULATIONS !!!");
//        }else{
//            System.out.println("you should get a descent job , lotteries are for lazy fools");
//        }
//
//
//    }
//
//    static int[] getRandomNumbers(){
//
//        Random r=new Random();
//        Scanner scan= new Scanner(System.in);
//        int []luckyNumbers=new int[6];
//        int []yourTicket=new int[6];
//
//        for (int i = 0; i <= luckyNumbers.length-1; i++) {
//            luckyNumbers[i]=r.nextInt(48)+1;
//
//            for (int j = 0; j < i-1; j++) {
//
//                if(luckyNumbers[i]==luckyNumbers[j]){
//
//
//                    //System.out.println(luckyNumbers[i]+" "+luckyNumbers[i]);
//                    //System.out.println("powtorzyly sie");
//                    i--;
//                }
//
//            }
//
//            //System.out.println(luckyNumbers[i]);
//        }
//
//        Arrays.sort(luckyNumbers);
//        return luckyNumbers;
//    }
//
//    static int [] getYourNumbers(){
//
//        int []yourNumbers=new int[6];
//        Scanner scan= new Scanner(System.in);
//
//        for (int i = 0; i <=yourNumbers.length -1 ; i++) {
//
//            System.out.print("enter number "+(i+1)+":");
//            while (!scan.hasNextInt()){
//                scan.nextLine();
//                System.out.println("must be a number, enter "+(i+1)+ " again:");
//            }
//            yourNumbers[i] = scan.nextInt();
//
//
//
//            for (int j = 0; j <i ; j++) {
//                if(yourNumbers[i]==yourNumbers[j]){
//                    System.out.println("your ticket aleready contains this number");
//                    i--;
//                    break;
//                }
//            }
//
//            if((yourNumbers[i]<1)||(yourNumbers[i]>49)) {
//                i--;
//                System.out.println("out of range 1-49");
//            }
//
//
//        }
//
//        //System.out.println(Arrays.toString(yourNumbers));
//        Arrays.sort(yourNumbers);
//        return yourNumbers;
//    }
//
//    static int compareNumbers(int [] a,int []b){
//
//        int counter=0;
//
//        for (int i = 0; i <= a.length - 1; i++) {
//
//            for (int j = 0; j <= b.length -1  ; j++) {
//
//                if(a[i]==b[j]){
//                    counter++;
//
//                    //System.out.println("trafiles liczbe "+a[i]);
//
//                }
//            }
//
//
//        }
//
//
//        return counter;
//    }
//}
