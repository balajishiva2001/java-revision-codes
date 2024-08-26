class Mobile {
    /*
     * {Encapsulation} Add the Access modeifier variable:
     * 1. default - package level
     * 2. public - universal leval
     * 3. private - class level
     * 4. protected - derived level
     */
    private String name;
    private double price;
    

    //no arg contructor or default constructor
    public Mobile() {
    }

    //arg constructor
    public Mobile(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    //getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void show(){
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
    }

    public String toString(){
        return String.format("Name: %s Price: %s",name,price);
    }

    
    public boolean equals(Mobile that) 
    {
        return this.price == that.price && this.name.equals(that.name);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        long temp;
        temp = Double.doubleToLongBits(price);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

}
public class Intro8 {
    public static void main(String[] args) {
        //No-args Constructors
        Mobile m = new Mobile();
        m.setName("Samsung");
        m.setPrice(10000);
        m.show();

        //Args Constructor
        Mobile m1 = new Mobile("Iphone", 100_00_00);
        m1.show();

        //Anonymous Object
        new Mobile("Nokia",65000).show(); 

        System.out.println(m1.toString());
        System.out.println(m1.equals(m));
        System.out.println(m1.hashCode());
    }
}
