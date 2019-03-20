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
public class Q8 {
    public static void main(String[] args) {
        int vize=70;
        int proje= 90;
        int final_not= 40;
        double ort = vize * 0.35 + proje * 0.15 + final_not * 0.5 ;
        
        System.out.println(ort);
       
        if (ort >= 85 && ort <= 100) {
            System.out.println("AA");
        } else if (ort>=75 && ort< 85){
            System.out.println("BA");
        } else if (ort>= 65 && ort<75) {
            System.out.println("BB");
        } else if(ort>= 50 && ort<65){
            System.out.println("CC");
        } else System.out.println("Kaldınız");
    } 
}
