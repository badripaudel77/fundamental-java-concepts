
package corejava.OOPs.constructor;

public class ConstructorChain {

    public ConstructorChain() {
        this(5);
        System.out.println("DEFAULT CONSTRUCTOR");
    }

    public ConstructorChain(int x) {
        this(5,6); 
        System.out.println("SINGLE PARAMETER");
    }

    public ConstructorChain(int x, int y) {
        System.out.println("DOUBLE PARAMETER");
    }

    public static void main(String[] args) {
        ConstructorChain obj = new ConstructorChain();
    }
}
