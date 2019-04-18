package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String word = scan.nextLine();

        System.out.print("Enter a number as an index : ");
        int index = scan.nextInt();
        if (index <= word.length()) {
            System.out.println("\nThe length of alphabet is : " + word.length());
            System.out.println("The substring from 0 to " + index + " is : " + word.substring(0, index));
        }else {
            System.out.println("\nIndex is larger than length.");
        }
        }
}
