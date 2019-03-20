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
public class Q4_a {
    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        int k = 3;
        
        int x=1,y=2,z=3;
        
        if (i > 0) 
            if (j > 0) 
                x = 0;
             else if (k > 0) 
                y = 0;
            else 
                z = 0;
            
        

        System.out.println("x = " +x);
        System.out.println("y = " +y);
        System.out.println("z = " +z);


    }
}
