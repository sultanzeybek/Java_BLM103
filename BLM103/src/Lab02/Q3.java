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
 * 
 * Harmonic mean is used when average of rates is required, below is the formula.

    Harmonic mean of n numbers x1, x2,
    x3, . . ., xn can written as below.
    Harmonic mean = n / ((1/x1) + (1/x2) + (1/x3) + . . . + (1/xn))
 * 
 * 
 * 
 * 
 */
public class Q3 {
    public static void main(String[] args) {
        
        int number_count;
        
        System.out.println("Enter number count:");
        Scanner my_scanner = new Scanner(System.in);
        number_count = my_scanner.nextInt();
        
        
        int x = 1;
        int y = 2;
        int z = 3;
        int w = 4;
        int t = 5;
        
        double harmonic =  number_count / ((1.0 / x) + (1.0 / y) + (1.0 / z)+ (1.0 / w) + (1.0 /t));
        System.out.println("Harmonic avr of " + number_count+" number is " + harmonic);
        
        
    }
    
}
