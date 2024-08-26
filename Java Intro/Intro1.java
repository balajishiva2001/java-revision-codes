public class Intro1 {

    public static void main(String[] args) {
        /*
         * Primitive Types:
         * Boolean - boolean:
         * Numeric:
         * Character - char
         * Integeral:
         * Integer - int
         * Byte - byte
         * Short - short
         * Long - long
         * floating-point:
         * Float - float
         * Double - double
         */

        // datatype variable_name = literals
        System.out.println("datatype variable_name = literals : \n");

        int num = 10_00_0;  
        System.out.println(((Object) num).getClass().getSimpleName() + " : " + num + "\n");

        byte by = 127;
        System.out.println(((Object) by).getClass().getSimpleName() + " : " + by + "\n");

        short sh = 587;
        System.out.println(((Object) sh).getClass().getSimpleName() + " : " + sh + "\n");

        long l = 54541l;
        System.out.println(((Object) l).getClass().getSimpleName() + " : " + l + "\n");

        float f = 3.2f;
        System.out.println(((Object) f).getClass().getSimpleName() + " : " + f + "\n");

        double d = 13e-2; // not compulsary to put d at end
        System.out.println(((Object) d).getClass().getSimpleName() + " : " + d + "\n");

        char c = 'A';
        System.out.println(((Object) c).getClass().getSimpleName() + " : " + c + "\n");

        boolean b = false;
        System.out.println(((Object) b).getClass().getSimpleName() + " : "+ b + "\n");
    
        /*Converstions one data type to other*/
        System.out.println("Converstions one data type to other : \n");

        int a = 100;
        System.out.println(((Object) a).getClass().getSimpleName() + " : "+ a);
        long s = a; //auto casting or upcasting
        System.out.println(((Object) s).getClass().getSimpleName() + " : "+ s + "\n");
        
        int aa=257;
        System.out.println(((Object) aa).getClass().getSimpleName() + " : "+ aa);
        byte ss = (byte) aa; //from the 32 bits truncates get the last 8 bits
        System.out.println(((Object) ss).getClass().getSimpleName() + " : "+ ss + "\n");

        byte aaa = 127;
        System.out.println(((Object) aaa).getClass().getSimpleName() + " : "+ aaa);
        int sss = aaa;
        System.out.println(((Object) sss).getClass().getSimpleName() + " : "+ sss + "\n");

    }

}
