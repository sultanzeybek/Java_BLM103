/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab07;

/**
 *
 * @author szeybek
 */
public class Q3 {
    public static void main(String[] args) {
        int number = 25;
        int result = (number / 10 == 2) ? 1:2;
        System.out.println(result);
        switch(number % 5){
            case 0 : result *=4;
                     System.out.println(result + " case0");
            case 1 : result += (int) Math.random()+1;
                     System.out.println(result + " case1");
                     break;
            case 2:  result +=3;
                     System.out.println(result+ " case2");
            default: result =1;
                     System.out.println(result +" default");
        }
        System.out.println(result);
    }
}
