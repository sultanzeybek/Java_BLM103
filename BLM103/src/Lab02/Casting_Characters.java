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

// Calculate the number of characters between the 2 characters
public class Casting_Characters {
    public static void main(String[] args) {
        char x = 'Z';
        char y = 'A';
        int count = (int) x - (int) y;
        int count1 = x-y;
        System.out.println(count);
        System.out.println(count1);
    }
    
}
