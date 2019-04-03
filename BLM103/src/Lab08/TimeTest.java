/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab08;

/**
 *
 * @author szeybek
 */
public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time(23,59,59);
//        t.increaseSecond();
//        t.showTime();
//        t.increaseSecond();
//        t.showTime();
//        t.increaseHour();
//        t.showTime();
        for (int i = 0; i < 1000; i++) {
            t.increaseSecond();
            t.showTime();
            
        }
    }
    
}
