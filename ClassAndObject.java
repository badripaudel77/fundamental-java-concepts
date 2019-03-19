
package corejava.OOPs.ClassAndObject;
public class ClassAndObject {
    int id;
    String name;
    int citizenId;
    public int setID(int i){
    citizenId=i;
    return citizenId;
    }  
}
class AnotherClass{
String address;
String country;
public void setAddress(){
address="Baglung";
}
public void setCountry(){
country="Nepal";
}
public void getCountry(){
    System.out.println("You are from "+country);
}
public void getAddress(){
    System.out.println("Your address is "+address);
}

}
class TestObject{
    public static void main(String[] args)
    {
        ClassAndObject obj=new ClassAndObject();
        obj.id=49;
        obj.name="Badri Paudel";
        System.out.println(" Your Nation ID is  : "+obj.setID(5678));
        System.out.println("Hello!"+obj.name);
        System.out.println(" Your id is "+obj.id);
        System.out.println("");
        System.out.println("Now from the object of the another class! ");
        AnotherClass anobj=new AnotherClass();
        anobj.setCountry();
        anobj.setAddress();
        anobj.getCountry();
        anobj.getAddress();
        
    
    }

}
