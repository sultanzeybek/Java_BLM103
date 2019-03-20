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
public class Q9 {
    public static void main(String[] args) {
        int number = 5;
        double fak = 1;
        
        while (number>0) { 
            fak = fak* number;
            number--;
            
        }
        System.out.println(fak);
        
    }
    
}
