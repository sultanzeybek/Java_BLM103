/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab02;

/**
 *
 * @author szeybek
 */

// Even or Odd without if-else condition

public class EvenOdd {
    public static void main(String[] args) {
        int number = 25;
        String evenOdd = (number %2==0) ?  "Çifttir":"Tektir";
        System.out.println(+number + " is " + evenOdd);
    
    }
}
