
package corejava.OOPs.ClassAndObject;


public class InstanceOfOperator {
  
    String name,location;
    public static void main(String[] args) {
        
        InstanceOfOperator ob=new InstanceOfOperator();
        System.out.println(ob instanceof  InstanceOfOperator);//return true cause ob belongs to InstanceOfOperator 
    }
}
