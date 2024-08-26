class Computer{
    void show(){
        System.out.println("Computer class show method is called");
    }
}

class Laptop extends Computer{
    void show(){
        System.out.println("Laptop class show method is called");
    }
}
/*
 * Method-overriding satisfy the method header should be same
 * method header = access modifier + return type + method signature(method name+parameters)
 * It is also called as late binding/runtime polymorphism/dynamic polymorphism
*/
public class MethodOverriding {

    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.show();
    }
    
}
