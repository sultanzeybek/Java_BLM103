/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab03;

/**
 *
 * @author szeybek
 */
public class Q4 {
    public static void main(String[] args) {
        double min_total=70;
        double vize = 47;
        double proje = 54;
        double kısmi_not = vize * 0.3 + proje * 0.2;
        double final_not = (min_total-kısmi_not) * 2 ;
        
        System.out.println(final_not);
        
        
    }
    
}
