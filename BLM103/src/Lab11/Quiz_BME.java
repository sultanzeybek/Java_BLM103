package Lab11;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author szeybek
 */
public class Quiz_BME {
    public static void main(String[] args) {
        int[][] matris = {
        {12, 34, 22, 98},
        {88, 54, 67, 11},
        {90, 91, 92, 93},
        {38, 39, 40, 41}

        };

        System.out.println("Oncesi...");
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Sonrası...");

        convert(matris);
    }
   static void convert(int [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length ;j++) {
                System.out.print(matrix[3-j][i] + " ");
            }
            System.out.println("");
        }
    }
}
