/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab11;

/**
 *
 * @author szeybek
 */
public class Quiz_EEM {
    public static void main(String[] args) {

        int[][] matris = {
        {12, 34, 22, 88},
        {96, 54, 99, 11},
        {90, 91, 92, 97},
        {100, 39, 40, 41}

        };

       
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Matrisin en büyük elemani..." + findMaxElement(matris));


        System.out.println("En büyük ikinci elamamın bulundugu indisler toplamı="
                +seconMaxIndex(matris));
    }
   static int seconMaxIndex(int [][] matrix){
       int secondIndex=0;
       int max = findMaxElement(matrix);
       int secondMax = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length ;j++) {
                if(matrix[i][j]>secondMax && matrix[i][j]<max){
                    secondMax = matrix[i][j];
                    secondIndex = i+j;
                }
            }
         
        }
        System.out.println("Matrisin ikinci en büyük elemani.." + secondMax);
        return secondIndex;
    }
    
    static int findMaxElement(int [][] matrix){
        int max = matrix[0][0];
       for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length ;j++) {
                if(matrix[i][j]> max){
                    max = matrix[i][j];
                }
            }
           
    
       }
 return max;
   } 
} 