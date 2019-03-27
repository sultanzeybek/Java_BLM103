/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab07;

import java.util.Random;

/**
 *
 * @author szeybek
 */
public class Q1 {
    public static void main(String[] args) {
        Random random = new Random();
        int min = -10;
        int max = 10;
        int number = min + random.nextInt(max-min+1);
        System.out.println(number);
    }
    
}
