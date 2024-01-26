/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package classes.myfirstproject;

/**
 *
 * @author juldh
 */
public class MyFirstProject {

    public static void main(String[] args) {
        
        Clock myClock1 = new Clock();
        Clock myClock2 = new Clock(30,40,6);
        Clock myClock3 = new Clock(myClock2);
        System.out.println(myClock1.hours+":"+myClock1.minutes+":"+myClock1.seconds);
        System.out.println(myClock2.hours+":"+myClock2.minutes+":"+myClock2.seconds);
        System.out.println(myClock3.hours+":"+myClock3.minutes+":"+myClock3.seconds);
        System.out.println(Clock.clockCounter+" clocks were created!!! :)");
    }
}
