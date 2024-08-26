public class Intro2 {
    public static void main(String[] args) {
        /*Aritmentic operators*/
        System.out.println("Aritmentic operators : \n");
        int a = 10;
        System.out.println("Intial Value: " + a);
        a +=2;
        System.out.println("Add: " + a);
        a -=3;
        System.out.println("Subtract: " + a);
        a *=2;
        System.out.println("Multiply: " + a);
        a /= 2;
        System.out.println("Quotient: " + a);
        a %= 2;
        System.out.println("Remainder: " + a);

        System.out.println("\n");

        //post-increment
        System.out.println("post-increment : \n");
        int b = 10;
        System.out.println("Intial Value: " + b);
        System.out.println("Post-Increment: " + b++);
        System.out.println("After Value: " + b + "\n");

        //pre-increment
        System.out.println("pre-increment : \n");
        int c = 10;
        System.out.println("Intial Value: " + c);
        System.out.println("Pre-Increment: " + ++c);
        System.out.println("After Value: " + c + "\n");

        //post-decrement
        System.out.println("post-increment : \n");
        int d = 10;
        System.out.println("Intial Value: " + d);
        System.out.println("Post-Decrement: " + d--);
        System.out.println("After Value: " + d + "\n");

        //pre-increment
        System.out.println("pre-decrement : \n");
        int e = 10;
        System.out.println("Intial Value: " + e);
        System.out.println("Pre-Decrement: " + --e);
        System.out.println("After Value: " + e + "\n");


        /*Relational Operators */
        System.out.println("Relational Operators : \n");
        int  x = 10;
        int y = 20;
        System.out.printf("less-than : %s \n", x<y);
        System.out.printf("less-than-or-equal : %s \n", x<=y);
        System.out.printf("greater-than : %s \n", x>y);
        System.out.printf("greater-than-or-equal : %s \n", x<=y);
        System.out.printf("not-equal : %s \n", x!=y);
        System.out.printf("equals : %s \n", x==y);

        System.out.println("\n");

        /*Logical Operators */
        System.out.println("Logical Operators : \n");
        int xx = 10;
        int yy = 2;
        int XX = 41;
        int YY = 5;
        System.out.printf("logical and : %s \n", (xx < yy) & (XX > YY));
        System.out.printf("logical or : %s \n", (xx < yy) | (XX > YY));
        System.out.printf("short-circuit and : %s \n", (xx < yy) && (XX > YY));
        System.out.printf("short-circui or : %s \n", (xx < yy) || (XX > YY));
    }
}
