//we cant inherit this class
final class T{
    final int p =1000_00; //we can't override this value
    final void show(){
        System.out.println("Inside show");
    }
    public static class innerClass{
        static String k = "Bala";
        static void message(){
            System.out.println("Inside Message");
        }
    }
}

class X1{
    void show1(){
        System.out.println("X1 called");
    }
}
class Y1 extends X1{
    void show2(){
        System.out.println("Y1 Called");
    }
}


public class Intro9 {
    @SuppressWarnings("removal")
    public static void main(String[] args) {
        T t = new T();
        System.out.println(t.p);
        t.show();

        //Based on object creation
        T.innerClass insideClass = new T.innerClass();
        System.out.println(insideClass.k);
        T.innerClass.message();
        
        //as there are static type we can also get the values
        System.out.println(T.innerClass.k);
        T.innerClass.message();

        /*
        *Upcasting
        */
        X1 obj1 = new Y1();
        obj1.show1();
        
        /*
         * Downcasting
         */
        Y1 obj2 = (Y1) obj1;
        obj2.show2();

        /*
         * Wrapper Classes
         * char -> Character
         * int -> Integer
         * short -> Short
         * byte -> Byte
         * long -> Long
         * double -> Double
         * float -> Float
         * boolean -> Boolean
         */

         int num = 7; //primitive type

        
        Integer num1 = new Integer(num); //boxing
        int r1 = num1.intValue(); // de-boxing
        System.out.println(r1);
        
        Integer num2 = num; //auto boxing
        int r2 = num2; //auto de-boxing
        System.out.println(r2);


    }
}
