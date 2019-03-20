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
public class Q3 {
    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        int k = 3;
        
        
        if (i > j) {
            if (i > k) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
        
        if (i > j) {
            if (i > k) {
                System.out.println("A");
            }
        } else {
            System.out.println("B");
        }
        
    }
            
}
