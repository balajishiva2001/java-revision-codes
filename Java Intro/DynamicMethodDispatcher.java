/*Hiearchial Inheritance*/
class A1{
    void show(){
        System.out.println("A1 Called");
    }
}
class B1 extends A1{
    void show(){
        System.out.println("B1 Called");
    }
}
class C1 extends A1{
    void show(){
        System.out.println("C1 Called");
    }
}

public class DynamicMethodDispatcher {
    public static void main(String[] args) {
        A1 obj = new A1();
        obj.show();

        obj = new B1();
        obj.show();

        obj = new C1();
        obj.show();
    }
}
