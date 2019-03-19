/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inheritance;

/**
 *
 * @author User
 */
class Animal1
{
    
   public  void cry(){
        System.out.println("This is Multilevel Inheritance demo");
        System.out.println("\n Dog Barks");
    }
}
    class Dog1 extends Animal1{
    public void dog(){
        System.out.println("Dog eats now");
    }
    
    }
     
    class Cat1 extends Dog1{
     public void cat(){
     
         System.out.println("Dog sleeps now--");
     }
       }
public class MultilevelInheritance{
    public static void main(String[] args) 
{
Cat1 c=new Cat1();
c.cry();
    System.out.println("");
c.cat();
    System.out.println("");
c.dog();


}
}
