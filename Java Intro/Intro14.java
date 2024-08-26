class NewExeption extends Exception{
    public NewExeption() {
        super();
    }

    public NewExeption(String message) {
        super(message);
    }

    public NewExeption(Throwable throwable) {
        super(throwable);
    }

    public NewExeption(String message, Throwable throwable) {
        super(message, throwable);
    }

}

class R{
    void show(int i) throws NewExeption{  
        if (i<18){
            throw new NewExeption("the value is less than 18");
        }
    }
}

class P{
    void message() throws ClassNotFoundException{
        Class.forName("Test");
    }
}

/*
 * Error and Exception extends Throwable class.
Throwable class is extended by Object class.

Error is divided into :-
1. Thread Death
2. Virtual Machine error ( Out of memory)
3. IO Error

Exception is divided into:-
1. Runtime Exception  (Unchecked Exception)
	- Arithmetic 
	- ArrayIndexOutOfBound
	- Null POinter
- It is your choose to handle or not

2. SQL Exception   (Checked Exception)
- It is necessary to handle

3. IO Exception  (Checked Exception)
- It is necessary to handle
 */
public class Intro14 {
    public static void main(String[] args) {
        /*
         * try-catch is used
         * Here we see the multiple catchs 
         * with exception-hiearchy child then parent
         */
        try{
            //int n=10/0;
            int a[] = new int[4];
            System.out.println(a[5]);
        }
        catch(ArithmeticException | NullPointerException e){
            System.out.println(e.getMessage());
            System.out.println(e.getClass().getSimpleName());
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getClass().getSimpleName());
        }


        /*
         * Using the throw keyword, 
         * when we intentially throw the exception
         */
        int j=0;
        try{
            if(j==0){
                throw new ArithmeticException("j value should not be zero");
            }
            int k = 100/j;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getClass().getSimpleName());
        }

        /*
         * Throws for Checked Exception
        */
        try {
            new P().message();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getClass().getSimpleName());
        }

       /*
        * Throws for Un Checked Exception/custom exceptions
        */
        try {
            R m = new R();
            m.show(14);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getClass().getSimpleName());
        }

        /*
         * Try with no catchs
         * Try-Finally
         */
        String m="";
        try{
            m = "Test";
            System.out.println(m);
            System.out.println("Inside try block");
        }finally{
            System.out.println("Inside finally block");
        }
        
    } 
}
