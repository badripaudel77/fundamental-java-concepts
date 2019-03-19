/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inheritance;


public class InheritanceDemo {
    float salary=50000;
    InheritanceDemo(){
        System.out.println("something goes here!");
    }
    
}

class Programmer extends InheritanceDemo{
int bonus=1000;
    public static void main(String[] args) {
        Programmer p=new Programmer();
      int bon=p.bonus; 
        System.out.println("salary is "+p.salary);  
      System.out.println("Bonus is "+bon);
        
    }
}
