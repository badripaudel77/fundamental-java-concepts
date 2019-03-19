

package corejava.OOPs.constructor;
public class ThisAndChainConstructor {
    String name,course;
    int id;
    float fee;
    public ThisAndChainConstructor(String name,String course,int id,float fee) {
    this("Badri Paudel","Java",45);
    this.fee=fee;
        System.out.println(name+" "+course+" "+id+" "+fee);
       
    
    }
        public ThisAndChainConstructor(String name,String course,int id) {
       
            System.out.println(name+" "+course+" "+id);
        }
        public static void main(String[] args) {
        new ThisAndChainConstructor("Ganesh","jsp",67,123);
    }
}
