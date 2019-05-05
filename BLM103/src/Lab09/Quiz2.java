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
public class Quiz2 {
    public static void main(String[] args) {
        int [][] myArray = {{1,4,3,6},{7,5,6,0},{8,9,5,2}};
        
        int [] maxIndexArray = maxIndexArraySatir(myArray);

        for (int i = 0; i < maxIndexArray.length; i++) {
            System.out.print(maxIndexArray[i]+" ");    
        }
    }
    
     public static int [] maxIndexArraySatir(int [][]  matrix){
        int [] newArray = new int[matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            int max= matrix[0][i];
            newArray[i] = 0;
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[j][i]>max){
                    newArray[i]=j;
                    max= matrix[j][i];
                }
                
            }
        }
        return newArray;
    }
    
}
  
    
//    public static int [] maxIndexArraySatir(int [][]  matrix,int satir,int sutun){
//        int [] newArray = new int[sutun];
//        for (int i = 0; i < sutun; i++) {
//            int max= matrix[0][i];
//            newArray[i] = 0;
//            for (int j = 1; j < satir; j++) {
//                if(matrix[j][i]>max){
//                    newArray[i]=j;
//                }
//                
//            }
//        }
//        return newArray;
//    }
    

//}