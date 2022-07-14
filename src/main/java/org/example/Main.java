package org.example;

import java.util.Scanner;

public class Main {
    public static void Score(int score){
        System.out.println("enter marks"+score);
        if (score >= 50) {
            System.out.println("you passed your exam");
        } else if (score <= 50) {
            System.out.println("you failed the test");
        } else {
            System.out.println("invalid output");
        }
    }

    public static void main(String[] args) {
        System.out.println("*******************");
        System.out.println(1+"continue");
        System.out.println(2 +" Exit");
        System.out.println("");
            Scanner myObj = new Scanner(System.in);
        int userInput = myObj.nextInt();
        if (userInput == 1){
            System.out.println("");
            System.out.println("input the length of triangle");
            System.out.println("***************");
            System.out.println("");
            Score(marks){
                System.out.println();
            }
        }


    }
}