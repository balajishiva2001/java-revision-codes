class newVersion {
    //static fields/static blocks/methods are the first things to mention in the class
    static String t = "Balaji";
    static String m = "";
    static String name;
    static{
        m = "Quest";
        System.out.println("Inside static block- only static fields assignment");
    }
    
    static void newPrint(){
        System.out.println("Inside Static method");
    }
    
    public void show(){
        System.out.println(name);
    }
}



public class Intro7 {
    public static void main(String[] args) {
        System.out.println("Inside main");
        System.out.println(newVersion.t);
        System.out.println(newVersion.m);
        newVersion.newPrint();
        newVersion.name = "Test";
        newVersion t = new newVersion();
        t.show();
        
        /*Load the Class with the ClassName*/
        try {
            Class.forName("newVersion");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
