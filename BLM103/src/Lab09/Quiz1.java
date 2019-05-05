/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab09;

/**
 *
 * @author szeybek
 */
public class Quiz1 {
    public static void main(String[] args) {
        int [][] myArray = {{1,4,3,6},{7,5,6,0},{8,9,5,2}};
        int [] maxIndexArray = maxIndexArraySutun(myArray);
        for (int i = 0; i < maxIndexArray.length; i++) {
            System.out.print(maxIndexArray[i]+" ");    
        }
       
    }
    
    public static int [] maxIndexArraySutun(int [][]  matrix){
        int [] newArray = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int max= matrix[i][0];
            newArray[i] = 0;
            for (int j = 1; j < matrix[i].length; j++) {
                
                if(matrix[i][j]>max){
                    newArray[i]=j;
                    max=matrix[i][j];
                }
                
            }
        }
        return newArray;
    }
    
   
    
}
