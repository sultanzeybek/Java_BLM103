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
public class Q2 {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            for (int j = 1; j <= 5; j++) {
                System.out.print(i + j + " ");
            }

            System.out.println("");
        }

        System.out.println("");

        for (int i = 1; i <= 5; i++) {

            for (int j = i; j < i + 5; j++) {
                System.out.print(j + " ");
            }

            System.out.println("");
        }

    }

}
