
class Calculator {
    private int a;
    private int b;

    int k =5;
    public Calculator(){
        super();
    }

    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    //method with no arguments and no return type
    public void add(){
        System.out.println("Sum: "+ (a+b));
    }

    //method with arguments and return type
    public int add(int x, int y){
        return x+y;
    }

    //method with no arguments and return type
    @Override
    public String toString() {
        return "Calculator [a=" + a + ", b=" + b + "]";
    }

    //method with arguments and no return type
    public void add(short x, short y){
        System.out.println(x+y);
    }
}

public class Intro4 {
    public static void main(String[] args) {
        Calculator c = new Calculator(10, 11);
        c.add();

        System.out.println("Add:"+c.add(5, 4));
        System.out.println(c.toString());
        c.add((short)15,(short)21);

        System.out.println("\n");
        //Heap & Stack
        System.out.println("Heap & Stack: \n");
        Calculator b = new Calculator();
        Calculator d = new Calculator();
        b.k = 11;
        System.out.println("k value for obj b " + b.k + " hashcode: "+b.hashCode());
        System.out.println("k value for obj d " +d.k + " hashcode: "+d.hashCode());
    }
}
