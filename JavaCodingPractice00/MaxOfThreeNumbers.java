package JavaCodingPractice00;
// Max of three numbers by user input

import java.util.Scanner;
public class MaxOfThreeNumbers {
    public static void main(String[] args) {

        int x;
        int y;
        int z;

        Scanner myObj = new Scanner(System.in);

        System.out.println("Entre a number:");
        x = myObj.nextInt();

        System.out.println("Entre second number:");
        y = myObj.nextInt();

        System.out.println("Entre third number:");
        z = myObj.nextInt();

        if (x>y){
            if (x>z)
                System.out.println(x + " is the maximum.");
            else
                System.out.println(z + " is the maximum.");

        }
        else {
            if (y>z)
                System.out.println(y + " is the maximum.");
            else
                System.out.println(z + " is the maximum.");

        }


    }

}
