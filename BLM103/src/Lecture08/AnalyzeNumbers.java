/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lecture08;

/**
 *
 * @author szeybek
 */
public class AnalyzeNumbers {

    public static void main(String[] args) {
        final int NUMBER_OF_ELEMENTS = 10;
        double[] numbers = new double[NUMBER_OF_ELEMENTS];
        double sum = 0;

        java.util.Scanner input = new java.util.Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a new number: ");
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
          
            
        }
        for (double sayı : numbers) {
            System.out.println(sayı);
        }

       // System.out.println(numbers);
        double average = sum / NUMBER_OF_ELEMENTS;

        int count = 0; // The number of elements above average
        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
            if (numbers[i] > average) {
                count++;
            }
        }

        System.out.println("Average is " + average);
        System.out.println("Number of elements above the average "
                + count);
    }

}
