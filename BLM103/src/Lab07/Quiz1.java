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
public class Quiz1 {

    public static void main(String[] args) {
     
         int number;
         
         int counter=0;
         
         
       Scanner s = new Scanner(System.in);
       System.out.println("Enter number");
       number = s.nextInt();
         int toplam =number;  
       
        while (number !=-1) {            
            System.out.println("Enter number :");
            number = s.nextInt();
            toplam = toplam + number;
             counter ++;
        }
        if(number == -1) {
            
            counter ++;
            System.out.println(" Girilen sayı adedi " + counter);
            System.out.println(" Girilen sayiların toplami " + toplam);
        }
        
}
    
}
