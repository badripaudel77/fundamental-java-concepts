package corejava.OOPs.constructor;

public class ConstructorDemo {

    private String name;
    private int id;

    public ConstructorDemo() {
        System.out.println("Default constructor Created \n ------------------------------->");
    }

    public ConstructorDemo(int id, String name) {
        this.id = id;
        this.name = name;

    }
    public void showParam() {
        System.out.println("Parameterized Constructor Created");
        System.out.println("Name is " + name + " Id is " + id);

    }

    public static void main(String[] args) {
        ConstructorDemo obj = new ConstructorDemo();
        ConstructorDemo ob = new ConstructorDemo(49, "Badri Paudel");
        ob.showParam();
    }
}
