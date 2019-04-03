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
//        int number;
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter any integer:");
//        number = s.nextInt();
      //  isPerfect(number);
        System.out.println("perfect number counts between 1 and 10000 is " +totalPerfects(1, 10000));
        
    }
    
    
    public static int totalPerfects(int start, int end){
        int counter = 0;
        for (int i = start; i <= end; i++) {
            if (isPerfect(i)) {
                System.out.println(i + " is perfect number");
                counter++;
            }
            
        }
        return counter;
    }
    
    public static boolean isPerfect(int n) {
        int sum = 0;
        boolean perfect = false;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == n) {
            perfect = true;
           // System.out.println("Given number is Perfect");
        }      
        return perfect;
    }
    
}
