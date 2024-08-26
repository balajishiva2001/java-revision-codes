class CalculatorNew{
    public int add(int a, int b, int c){
        return a+b+c;
    }

    public int add(int a, int b){
        return a+b;
    }

    public double add(double a, int b){
        return a+b;
    }
}

/*
 * Method Overloading should satisfy the same method name 
 * with different no. of parameters, parameters with different data type
 * It is also called as Early binding/compile time polymorphism/static polymorphism
 */
public class MethodOverloading {
    public static void main(String[] args) {
        CalculatorNew c = new CalculatorNew();
        System.out.println(c.add(3.5, 2));
        System.out.println(c.add(4, 3));
        System.out.println(c.add(2, 5, 7));
    }
}
