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
public class Fractions {
    public static void main(String[] args) {
        double a = 23.03;
        double b = 23.78;
        
        double first_frac = a - (int)a;
        double second_frac = b - (int)b;
        String first_grater = "false";
        first_grater = (first_frac>second_frac) ? "true" : "false";
        System.out.println(a+" is greater than " +b+" " + first_grater);
        
    }
}
