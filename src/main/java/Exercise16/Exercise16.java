/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Bernard Fonrose
 */

package Exercise16;

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {

        Scanner driving = new Scanner(System.in);

        System.out.print("Please enter your age: ");

        int entry = driving.nextInt();

        String pass;

        pass = (entry > 16) ? "You can legally drive" : "You cant legally drive yet";

        System.out.printf("%s", pass);
    }
}
