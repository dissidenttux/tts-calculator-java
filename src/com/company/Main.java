package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*  Create a Java Calculator Class that does the following five commands:
	- An add method that takes in two integer numbers and adds them together the call to that
	    method would look like this: add(int num1, int num2)
    - A subtraction method that takes in two integers and subtracts them from one another
        would look like this: subtract( int num1, int num2)
    - A multiplication method that takes in two integer numbers and multiplies them together the
        call to that method would look like this: multiply(int num1, int num2)
    - A division method that takes in two integer numbers and divides them the call to that
        method would look like this: divide(int num1, int num2)
    - A square method that takes in one integer and squares it: square(int num1, int num2)
    */



        // Prompt the user
        System.out.println("Welcome to TTS Calculator: Java Edition\n" + "Please enter two " +
                "numbers:");
        // Scan for user inputs
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        // TODO [user navigation command logic to be added in a future update]
        int result = Calculator.multiply(num1, num2);

        System.out.println("Result: " + result);




    }
}
