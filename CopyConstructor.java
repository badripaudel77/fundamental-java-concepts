/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corejava.OOPs.constructor;


public class CopyConstructor 
{
    String name;  //1 (say)
    int id;// 2 (say)

    public CopyConstructor(int i,String n) {
    id=i; // 3 (say)
    name=n; //4 (say)
    }

    public CopyConstructor(CopyConstructor c) {
        id=c.id; //copying in 3 from  2 
        name=c.name; //copying in 4 from 1
    }
    public void showCopy(){
        System.out.println("Name is "+ name+" : and ID is "+id);
    }
    public static void main(String[] args) {
        CopyConstructor obj1=new CopyConstructor(49,"Badri Paudel");//Object now holding 49 and Badri Paudel
        CopyConstructor obj2= new CopyConstructor(obj1);//passing above obj to copy the same value
        obj1.showCopy();
        obj2.showCopy();
    }
    
    
    
}
