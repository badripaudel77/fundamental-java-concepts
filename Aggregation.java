package com.inheritance.composition;

class Address {

    String state = "03";
    String city = "Kathmandu";
}

class Information {

    String name = "Badri Paudel";
    Address address;//info has-a address

    public void information() 
    {
        address=new Address();
        System.out.println("Name is" + name);
        System.out.println("Address is : State\t city\n");
        System.out.println(address.city+" "+address.state);

    }
}

public class Aggregation {
    
    public static void main(String[] args)
    {
//        Address a= new Address();
//        a.address();
        Information obj = new Information();
        obj.information();

    }
}
