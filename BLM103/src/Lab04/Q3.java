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
public class Q3 {
    public static void main(String[] args) {
        int factorial = 1;
        for (int i = 1; i < 10; i++) {
            factorial *= i;
        }
        
        System.out.println(factorial);
    }
}
