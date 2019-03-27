/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab07;

/**
 *
 * @author szeybek
 */
public class Q2 {
    public static void main(String[] args) {
        int mult = 1;
        int counter = 1;
        while (counter<5) {    
            if(counter % 3 == 0) continue;
            mult *= counter;
            System.out.println(mult);
            counter++;
            
        }
    }
    
}
