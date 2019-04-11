/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab09;

import Lab08.*;

/**
 *
 * @author szeybek
 */
public class Q1 {

    public static void main(String[] args) {
        int number = 7;
        int[] array = {6, 7, 5, 3, 2, 11, 23, 89};

        boolean isContain = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                isContain = true;
                break;
            }
        }

        if (isContain) {
            System.out.println("array contains the number");
        } else {
            System.out.println("Not Find!");
        }

        boolean sonuc = isContainNumber(array, 4);
        System.out.println(sonuc);
        System.out.println(isContainNumber(array, 11));
        System.out.println(isContainNumber(array, 7));
        
        
        
        for (int i : findIndex(array, 7)) {
            System.out.print(i + " ");
        }
        
        
    }

    static boolean isContainNumber(int[] array, int number) {
        boolean varMi = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                varMi = true;
                break;
            }
        }

        return varMi;
    }
    
    
    
     static int [] findIndex(int[] array, int number) {
        int[] indexArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                indexArray[i] = 1;
            }
        }

        return indexArray;
    }
    
     
    
}
