/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab02;

import java.util.Scanner;

/**
 *
 * @author szeybek
 */

//  compute the average of three numbers.

public class Q2 {
    public static void main(String[] args) {
        int a = 32;
        int b = 29;
        int c = 55;
        
        double avarage = (a + b + c) / 3.0;
        System.out.println("The avarage of three numbers is " + avarage);
        
        Scanner my_scanner = new Scanner(System.in);
        System.out.println("Enter first number:" );
        a = my_scanner.nextInt();
        System.out.println("Enter second number:" );
        b = my_scanner.nextInt();
        System.out.println("Enter third number:" );
        c = my_scanner.nextInt();
        
        
        System.out.println("The avarage of three numbers is " + (a+b+c)/3.0);

        
    }
}
