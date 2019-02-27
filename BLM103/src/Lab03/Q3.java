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

//Avarage

public class Q3 {
    public static void main(String[] args) {
        int number = 154;
        int c = number %10;
        if (c>=5) {
            number = number+(10-c);
            
        } else number = number - c;
        
        System.out.println(number);
    }
    
}
