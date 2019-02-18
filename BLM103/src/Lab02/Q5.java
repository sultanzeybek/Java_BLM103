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
// Calculate the first three fibonacci number
// Fibonacci series start with 0 and 1
public class Q5 {
    public static void main(String[] args) {
        
        int f0 = 0;
        int f1 = 1;
        
        int f2 = f0 + f1;
        
        f0 = f1;
        f1 = f2;
        
        int f3 = f0 + f1;
        
        f0 = f2;
        f1 = f3;
        
        int f4 = f0 + f1;
        
        f0 = f3;
        f1 = f4;
        
        int f5 = f0 + f1;
                
        
        System.out.println(" 0 1 " + f2 +" " +f3 + " " +f4 +" " +f5);
        
        
    }
    
}
