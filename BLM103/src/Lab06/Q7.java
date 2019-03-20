/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab06;

/**
 *
 * @author szeybek
 */
public class Q7 {
    public static void main(String[] args) {
        System.out.println(calculatePower(2, 3));
    }
    
    public static double calculatePower(int number, int power){
        double pow=1;
        for (int i = 0; i < power; i++) {
            pow *= number;
        }
        return pow;
    }
}
