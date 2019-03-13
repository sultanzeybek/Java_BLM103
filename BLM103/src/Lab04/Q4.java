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
public class Q4 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            int factorial = 1;
            for (int j = 1; j <= i; j++) {
                
                factorial *= j;
            }
            
            System.out.println(factorial);
            

        }
        int f =1;
        
        for (int i = 1; i <= 10; i++) {
            f = f * i;
            System.out.println(+i+" factorial " +f);
        }
        
    }
    
}
