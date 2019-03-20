/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab06;

/**
 *
 * @author szeybek
 */
public class Q6 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        int number = 10;
        System.out.println(factorial(number));
        
    }
            
    public static double factorial(int number){
        double fac=1;
        for (int i = 1; i <= number; i++) {
            fac *= i;
        }
        return fac;
    }
}
