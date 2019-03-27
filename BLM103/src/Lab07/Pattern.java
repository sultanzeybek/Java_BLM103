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
public class Pattern {
    public static void main(String[] args) {
        int i = 1;
        while (i<7) {            
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
                System.out.println("");
                i++;
            }
        }
    }
}
