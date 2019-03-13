/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab04;

/**
 *
 * @author szeybek
 */
public class Q6 {
    public static void main(String[] args) {
        int toplam = 0;
        int count = 0;
        while (toplam<3000) {
           
            count++;
            toplam+=count;
            if(toplam>3000){
                toplam-=count;
                break;
            }
           
        }
        System.out.println(+count+" adimda " +toplam +" degerine ulasılmıstır.");
    }
    
}
