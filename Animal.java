
package com.inheritance;

public class Animal {
    public void cry(){
        System.out.println("Animal Cry now");
    }
    
}
class Dog extends Animal
{
public void bark(){
    System.out.println("This is Dog ---how how---");
}
}
class Cat extends Animal{
public void meow(){
    System.out.println("This is cat ---meowing---");
}
}

class HierarchicalTest {
    public static void main(String[] args) {
        Cat c=new Cat();
        Dog d= new Dog();
        c.cry();
        d.cry();
        System.out.println("");
        d.bark();
        System.out.println("");
        c.meow();
    }
}
