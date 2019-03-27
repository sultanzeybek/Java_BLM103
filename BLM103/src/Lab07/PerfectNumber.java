/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab07;

import java.util.Scanner;

/**
 *
 * @author szeybek
 */
public class PerfectNumber {
    
    public static void main(String[] args) {
        int number;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any integer:");
        number = s.nextInt();
        isPerfect(number);
        
    }
    
    public static void isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == n) {
            System.out.println("Given number is Perfect");
        } else {
            System.out.println("Given number is not Perfect");
        }        
        
    }
    
}
