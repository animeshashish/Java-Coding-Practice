package JavaCodingPractice00;

import java.util.Scanner;

public class MaxOfTwoNumbers {
    public static void main(String[] args) {
        int x;
        int y;



        Scanner myObj = new Scanner(System.in); // Create object of scanner class

        System.out.println("Entre a number:");
        x = myObj.nextInt(); // Read user input

        System.out.println("Entre Second number:");
        y = myObj.nextInt(); // Read user input


        System.out.println("Max of two number is:" + Math.max(x,y)); // Print the max of two numbers
    }
}
