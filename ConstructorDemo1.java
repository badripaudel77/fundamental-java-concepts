/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corejava.OOPs.constructor;

class A{
public A(){

    System.out.println("This is Parent class Constructor A ");
}
public A(int a){
    System.out.println("parameter");}
}
class B extends A{
public  B()
{
   
 //super(2);
    System.out.println("This is child constructor B");
}
}
public class ConstructorDemo1 
{
    public static void main(String[] args) {
        
    
   B b=new B();
  
   
    }
}
