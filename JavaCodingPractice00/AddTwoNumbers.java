package JavaCodingPractice00;

import java.util.Scanner;

// Sum of two numbers by user input

public class AddTwoNumbers {
    public static void main(String[] args) {
        int x;
        int y;
        int sum;

        Scanner myObj = new Scanner(System.in); // Create the object of scanner class.

        System.out.println("Type a number:");
        x = myObj.nextInt(); // Read user input

        System.out.println("Type another number");
        y = myObj.nextInt(); // Read user input

        sum = x+y;
        System.out.println("Sum is:" + sum); // Output user input
    }
}
