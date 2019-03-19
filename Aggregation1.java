/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inheritance.composition;
class Emp
{
String name;
int age;
public Emp(String name,int age){
this.name=name;
this.age=age;
}
}

class Company{
String cname;
String cloc;
Emp emp;//HAS-A relationship
Company(String name,String cloc,Emp emp)
{
cname=name;
this.cloc=cloc;
this.emp=emp;
}
public void disp(){

    System.out.println("Info\nName is:"+emp.name+" Age of Emp is\n "+emp.age+" and Com name is\n :"+cname+" com loc\n "+cloc);

}
}


public class Aggregation1 {
    public static void main(String[] args) {
        Emp e=new Emp("Ganesh", 20);
        Company c=new Company("ABC", "KTM", e);
        c.disp();
    }
}
