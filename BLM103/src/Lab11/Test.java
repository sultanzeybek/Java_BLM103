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
public class Test {
    public static void main(String[] args) {
        double fakt = 1 ;
        double sayi = 5;
        while(sayi>0){
            fakt *= sayi;
            sayi--;
        }
        System.out.println(fakt);
    
    }
    
}
