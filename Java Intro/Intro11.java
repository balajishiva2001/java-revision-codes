interface BaseInterface1{
    int age = 15; //variables are public,static and final
    void show(); //methods are public and abstract  
}

//interface extends with other single interface
interface BaseInterface2 extends BaseInterface3{
    String name ="Interface";
    void message();
}

interface BaseInterface3{
    boolean value = false;
    void text();
}
//interface extends with other multiple interfaces
interface BaseInterface4 extends BaseInterface1,BaseInterface3{
    long kvalue = 10_00_00l;
    void pprint();
}

//SAM => Single Abstract Method interface
//Functional Interface
@FunctionalInterface 
interface BaseInterface5{
    void preprint();
}

//Normal interface - two or more methods
interface BaseInterface6{
    void A();
    void B();    
}

//Marker interface/blank interface - no methods
interface BaseInterface7{

}
class derivedClass1 implements BaseInterface7{
    void M(){
        System.out.println("M method is called");
    }
}

//class implements multiple interfaces
class derivedClass implements BaseInterface4,BaseInterface2{

    @Override
    public void text() {
        System.out.println("Text method called");
    }

    @Override
    public void message() {
        System.out.println("Message method called");
    }

    @Override
    public void show() {
        System.out.println("Show method called");
    }

    @Override
    public void pprint() {
        System.out.println("Pprint method called");
    }

}
public class Intro11 {
    public static void main(String[] args) {
        derivedClass d = new derivedClass();
        d.text();
        d.message();
        d.show();
        d.pprint();
        System.out.println(d.age);
        System.out.println(d.name);
        System.out.println(d.value);
        System.out.println(d.kvalue);
        System.out.println(derivedClass.age);
        System.out.println(derivedClass.name);
        System.out.println(derivedClass.value);
        System.out.println(derivedClass.kvalue);

        BaseInterface1 b1 = new derivedClass(); //upcasting
        b1.show();
        System.out.println(b1.age);
        System.out.println(BaseInterface1.age);

        BaseInterface2 b2 = (BaseInterface2) b1; //downcasting
        b2.message();
        b2.text();
        System.out.println(b2.name);
        System.out.println(b2.value);
        System.out.println(BaseInterface2.name);
        System.out.println(BaseInterface2.value);

        BaseInterface3 b3 = (BaseInterface3) b2; //downcasting
        b3.text();
        System.out.println(b3.value);
        System.out.println(BaseInterface3.value);

        BaseInterface4 b4 = (BaseInterface4) b3;
        b4.pprint();
        b4.show();
        b4.text();
        System.out.println(b4.age);
        System.out.println(b4.kvalue);
        System.out.println(b4.value);
        System.out.println(BaseInterface4.age);
        System.out.println(BaseInterface4.kvalue);
        System.out.println(BaseInterface4.value);

        BaseInterface5 b5 = new BaseInterface5() {
            @Override
            public void preprint(){
                System.out.println("preprint method called");
            }
        };

        b5.preprint();

        BaseInterface6 b6 = new BaseInterface6() {

            @Override
            public void A() {
                System.out.println("A method is called");
            }

            @Override
            public void B() {
                System.out.println("B method is called");
            }
            
        };

        b6.A();
        b6.B();

        derivedClass1 b7 = new derivedClass1();
        b7.M();        

    }
}
