/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corejava.OOPs.ClassAndObject;

class Time {

    int hr, min, sec;

    public Time(int hr, int min, int sec) {
        if (hr < 0 || hr >= 24 || min < 0 || min >= 60 || sec < 0 || sec >= 60) {
            throw new IllegalArgumentException(
                    "Illegal argument in type hour,minute or second"
            );
        }
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }
    public Time(Time t){
this(t.hr,t.min,t.sec);
    }
    public void dispTime(){
        System.out.println("Hour: "+hr +" \n Minute is : "+min +"\n and Second is  "+sec );
    }
}

public class TimeDemo {

    public static void main(String[] args) {
        Time t = new Time(1, 2, 3);
        Time t1=new Time(t);
        t1.dispTime();
        t.dispTime();
    }

}
