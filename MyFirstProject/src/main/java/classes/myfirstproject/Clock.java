/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.myfirstproject;

/**
 *
 * @author juldh
 */
public class Clock {
    int seconds;
    int minutes;
    int hours;
    
    static int clockCounter;
    
    public Clock(){
        seconds = 0;
        minutes = 0;
        hours = 0;
        
        clockCounter++;
    }
    public Clock(int seconds, int minutes, int hours){
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
        
        clockCounter++;
    }
    public Clock(Clock clock){
        this.seconds = clock.seconds;
        this.minutes = clock.minutes;
        this.hours = clock.hours;
        
        clockCounter++;
    }
}
