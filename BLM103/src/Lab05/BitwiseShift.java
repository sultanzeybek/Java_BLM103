/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab05;

/**
 *
 * @author szeybek
 */
public class BitwiseShift {
    public static void main(String[] args) {
       
        int number = 8;
        int binary_number = 0b1111100000011111;
        int count = 0;
        int count_binary=0;
        int lastBit;
       
        while (number>0) { 
        lastBit = number & 1;
        
            if (lastBit==0) {
                count++;
            }
            number = number>>1;
        }
        System.out.println(count);
        System.out.println();
        
         while (binary_number>0) { 
         lastBit = binary_number & 1;
        
            if (lastBit==0) {
                count_binary++;
            }
            binary_number = binary_number>>1;
        }
        
        System.out.println(count_binary);
        
    }
}
