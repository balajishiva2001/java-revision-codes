/*Single Inheritance */
class A{
    void A_Show(){
        System.out.println("A is called");
    }
}
class B extends A{
    void B_Show(){
        System.out.println("B is called");
    }
}

/*Multi-level Inheritance*/
class X{
    void X_Show(){
        System.out.println("X is called");
    }
}
class Y extends X{
    void Y_Show(){
        System.out.println("Y is called");
    }
}
class Z extends Y{
    void Z_Show(){
        System.out.println("Z is called");
    }
}

/*Hiearchial Inheritance*/
class K{
    void K_Show(){
        System.out.println("K is called");
    }
}
class M extends K{
    void M_Show(){
        System.out.println("M is called");
    }
}
class N extends K{
    void N_Show(){
        System.out.println("N is called");
    }
}

/*In java multple inheritance is not possible*/

public class InheritanceTypes {
    public static void main(String[] args) {
        //Single Inheritance
        System.out.println("Single Inheritance: ");
        B b = new B();
        b.A_Show();
        b.B_Show();

        //Multi-level Inheritance
        System.out.println("Multi-level Inheritance: ");
        Z z = new Z();
        z.X_Show();
        z.Y_Show();
        z.Z_Show();

        //Hiearchial Inheritance
        System.out.println("Hiearchial Inheritance: ");
        M m = new M();
        m.K_Show();
        m.M_Show();

        N n = new N();
        n.K_Show();
        n.N_Show();


    }
}
