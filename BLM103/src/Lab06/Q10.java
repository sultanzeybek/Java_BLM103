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
public class Q10 {
    public static void main(String[] args) {
        int number = 1;
        for (int i = 0; i < 6; i++) {
            for (int j = number; j > number / 2; j = j - 2) {

                System.out.print(j + " ");
            }
            number = number * 2;
            System.out.println("");

        }
    }
}
