package com.cts.test;

import java.util.Scanner;

import com.cts.assignmentprogrm.NumberToString;

public class NumberToStringTest {

    public static void main(String[] args) {
    	NumberToString numberToWord=new NumberToString();
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type a number between 0 and 999 OR type -1 to exit:  ");
        number = scanner.nextInt();
        while(number!=-1){
            if(number>=0 && number<=999){
                if(number==0){
                    System.out.print("NUMBER AFTER CONVERSION:\tZERO");
                } else {
                    System.out.print("NUMBER AFTER CONVERSION:\t");
                    numberToWord.numberToWord((number / 100) % 10, " HUNDRED");
                    numberToWord.numberToWord((number % 100), " ");
                }

            } else{
                System.out.print("NUMBER OUT OF RANGE");
            }
            System.out.print("\nPlease type a number between 0 and 999 OR type -1 to exit:  ");
            number = scanner.nextInt();
        }
    }

}
