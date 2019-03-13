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
public class Q5 {
    public static void main(String[] args) {
        int number = 123456;
        int newNumber=0;
        while (number > 0) {            
            int birler= number %10;
            newNumber = newNumber *10 + birler;
            number = number / 10;
        }
        System.out.println(newNumber);
    }
}
