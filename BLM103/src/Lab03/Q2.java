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
public class Q2 {
    public static void main(String[] args) {
        int a=90,b=9,c=7;
        int max;
        if (a>b && a>c) {
            max = a;
        } else if (b>c && b>a) {
            max = b;
            
        } else {
            max = c;
        }
        
        System.out.println("Maximum number between " +a+" "+b+" "+c+" is " +max);
    }
}
