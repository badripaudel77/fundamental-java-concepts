package com.inheritance;

class Bank
{
    int id=56;
String bankName,bankLocation,catagory;

public Bank(String bankName,String bankLocation,String catagory)
{
this.bankName=bankName;
this.bankLocation=bankLocation;
this.catagory=catagory;
}

public Bank()
{
    System.out.println("Information of the bank");
    System.out.println("--"+bankName+" "+bankLocation+" "+catagory);
}

}
class Branches extends Bank
{
 int nu=super.id;//super keyword accesses the super class instance variables,methods and constructor

    private String branchLocation;
  
    public  Branches(String n,String a,String c,String loc){
    super(n,a,c);//calling the super class constructor which has 3 parrameters
    this.branchLocation=loc;
     System.out.println(nu);
   
//    super.bankName="Everest Bank LTD.";
//    System.out.println("Bank name is"+bankName);
   
}
public void display(){
 System.out.println("Branch location is "+branchLocation);
    System.out.println("Name is "+bankName+" "+bankLocation+" "+catagory);
}

}

public class SuperAndInheritance {
    public static void main(String[] args) {
 
    
    Branches br=new Branches("NIC","Baneshwor","A","Shankhamool");
  br.display();
    }
 
}
