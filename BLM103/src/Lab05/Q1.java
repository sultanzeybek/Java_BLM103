/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab05;

/**
 *
 * @author szeybek
 */
public class Q1 {

    public static void main(String[] args) {
        int number = 12345;
        int digit = 3;
        boolean isContain = false;
        while (number > 0) {
            System.out.print(" " + number % 10);
            if (number % 10 == digit) {

                isContain = true;
            }
            number = number / 10;

        }
        if (isContain) {
            System.out.println(" Number is contain " + digit);

        }
    }

}
