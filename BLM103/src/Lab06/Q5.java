/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab06;

import java.util.Scanner;

/**
 *
 * @author szeybek
 */
public class Q5 {

    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive an input
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number % 2 == 0 && number % 3 == 0) {
            System.out.println(number + " is divisible by 2 and 3.");
        }

        else if (number % 2 == 0 ) {
            System.out.println(number + " is divisible by 2");
        }
        else if (number % 3 == 0) {
            System.out.println(number
                    + " is divisible by  3");
        }
        else System.out.println( + number +" is not divisible 2 or 3");
    }

}
