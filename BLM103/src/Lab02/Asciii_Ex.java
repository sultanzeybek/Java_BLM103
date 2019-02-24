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
public class Asciii_Ex {
    public static void main(String[] args) {
        // ASCII code of character A is 65
        
        char character = 65;
        boolean isVowel = false;
        isVowel = (character == 'A') ? true : isVowel;
        isVowel = (character == 'E') ? true : isVowel;
        isVowel = (character == 'I') ? true : isVowel;
        isVowel = (character == 'U') ? true : isVowel;
        
        System.out.println(isVowel);
    }
}
