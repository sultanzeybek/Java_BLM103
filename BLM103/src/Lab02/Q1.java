/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab02;

/**
 *
 * @author szeybek
 */

// Convert Celcius degrees to a Fahrenheit degree
// T(°F) = T(°C) × 9/5 + 32


public class Q1 {
    
    public static void main(String[] args) {
        
        int degree = 35;
        double fahrenheit;
        fahrenheit = degree * (9.0 / 5) + 32;
        
        System.out.println("Celsius "+ degree+ "is Fahrenheit degree " + fahrenheit);

        
    }
    
}
