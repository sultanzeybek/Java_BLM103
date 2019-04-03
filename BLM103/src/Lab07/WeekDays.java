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
public class WeekDays {
    public static void main(String[] args) {
        int number;
       Scanner s = new Scanner(System.in);
       System.out.println("Enter any integer for day information:");
       number = s.nextInt();
       System.out.println(weekDays(number));
       
    }
    
    public static String weekDays(int number){
        String day = "";
         
         
         switch(number){
             
             case 1 : day = "Monday";
             break;
             case 2 : day = "Tuesday";
             break;
             case 3 : day = "Wednesday";
             break;
             case 4 : day = "Thursday";
             break;
             case 5 : day = "Friday";
             break;
             case 6 : day = "Saturday";
             break;
             case 7 : day = "Sunday";
             break;
             default: 
             day = "Invalid day"; 
             break;
             
         }
         
         return day;
         
    }
    
   
}
