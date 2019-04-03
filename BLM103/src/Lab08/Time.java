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
public class Time {
    int hour, minute, second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    
    void increaseSecond(){
        second++;
        if(getSecond() >= 60){
            increaseMinute();
            setSecond(0);
           
    }
        
            
        }
    
    void increaseMinute(){
        minute++;
        if(getMinute() >= 60){
            increaseHour();
            setMinute(0);
        }
    }
    
    void increaseHour(){
        hour++;
        if(getHour()>=24){
            setHour(0);
            setMinute(0);
            setSecond(1);
            
        }
    }
    
    void showTime(){
        System.out.println(getHour() + ":" + getMinute() + ":" + getSecond());
    }
}
