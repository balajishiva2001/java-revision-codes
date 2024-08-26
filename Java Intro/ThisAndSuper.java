class Animal{
    private String name;
    private String type;
    String tt = "Quest"; 
  
    @Override
    public String toString() {
        return "Animal [name=" + name + ", type=" + type + "]";
    }

    public Animal() {
        this("Dolphin","Aquatic"); //refer to current class constructor
        System.out.println("Default Constructor Called");
    }
    
    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
        System.out.println("Parameterized Constructor Called");
    }
    
    public void showTT(){
        System.out.println(this.tt); //refer to current class variable
    }

    public void pprint(){
        this.showTT(); //refer to current class method
    }

}
class Fish extends Animal{
    
    public Fish(){
        super("Star Fish", "Aquatic"); //refer to parent class constructor
        System.out.println(super.toString());
    }
    void pshow(){
        System.out.println("pshow called");
        System.out.println(super.tt); //refer parent class field
    }
    void mshow(){
        super.showTT(); //refer to parent class method
    }
}

public class ThisAndSuper {
    public static void main(String[] args) {
        
        Animal a = new Animal();
        System.out.println(a.toString());
        a.showTT();

        Fish f = new Fish();
        f.pshow();
        f.mshow();
        
    }
    
}
