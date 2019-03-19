/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inheritance.composition;

class Name{

    String firstName,lastName;
    
    public Name(String fname,String lname)
    {
    this.firstName=fname;
    this.lastName=lname;
    
    }
}

public class Student {
    int sid,age;
    //creating has a relationship 
    //student HAS-A name
    Name name;
    
    Student(int sid,int age,Name n)
    {
    this.age=age;
    this.name=n;
    this.sid=sid;
    }
    public void showStudentInfo(){
        System.out.println("FirstName is  :"+name.firstName+""
                + "\n LastName is "+name.lastName+" \n age is "+age+" and \n Id is "+sid);
    }
    
}
class TestStudent{
    public static void main(String[] args) {
        Name n=new Name("Badri","Paudel");
        Student s=new Student(45, 21,n);
        s.showStudentInfo();
    }

}
