/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab04;

/**
 *
 * @author szeybek
 */
public class Q7 {
    public static void main(String[] args) {
        for (int i = 9; i >=1; i--) {
            for (int j = 0; j < 10; j++) {
                if(9-i>=j) System.out.print("_");
                else System.out.print(i);
            }
            System.out.println("");
        }
    }
    
}
