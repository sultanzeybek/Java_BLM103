/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab03;

/**
 *
 * @author szeybek
 */
public class Q5 {
    public static void main(String[] args) {
        int number = 23;
        if (number % 4 == 0) {
            
            System.out.println("divided by 4");
            
        }  else if (number % 3 == 0 ) {
            System.out.println("divided by 3");
            
        } else  if (number % 2 == 0) {
            System.out.println("divided by 2");
            
        } else System.out.println("divided by 1");
    }
    
}
