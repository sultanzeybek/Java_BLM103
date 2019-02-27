/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab03;

import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author szeybek
 */
public class Q1 {
    public static void main(String[] args) {
        int not=90;
        String harfNot = "";
        if(not<=100 && not>=70){
            harfNot = "AA";
            
        } else if (not<70 && not>=45) {
            harfNot = "CC";
            
        } else if (not < 45) {
            harfNot = "FF";
        } else {
            System.out.println("Geçersiz!!");
        }
        
        System.out.println("Ögrencinin harf notu " +harfNot);
    }
    
}
