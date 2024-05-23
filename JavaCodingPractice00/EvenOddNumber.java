package JavaCodingPractice00;

// Check Even and Odd number

import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        int x;

        Scanner myObj = new Scanner(System.in);

        System.out.println("Entre a number:");
        x = myObj.nextInt();

        // checking if number is even or odd

        if (x % 2 == 0) {
            // If remainder is zero then the number is even number
            System.out.println(x + " is even number.");

        } else { // If the remainder is not zero then the number is odd number
            System.out.println(x + " is odd number.");

        }

    }
}
