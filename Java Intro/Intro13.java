@FunctionalInterface
interface X2 {
    void show(int i);
}

@FunctionalInterface
interface Y2 {
    void add(int a, int b);
}

@FunctionalInterface
interface X3 {
    String fullName(String fname, String lname);
}

@FunctionalInterface
interface Y3{
    String[] getRecords();
}
public class Intro13 {

    public static void main(String[] args) {
        // lamda with no parameters and no return type
        X2 t = (i) -> System.out.println("Show Method is called using lamda" + i);
        t.show(10);
        
        // lamda with parameters and no return type
        Y2 m = (i, j) -> System.out.println("Add: " + (i + j));
        m.add(10, 110);
        
        //lamda with parameters and return type
        X3 n = (i, j) -> i + j;
        System.out.println(n.fullName("Siraj", "M"));
        
        //lamda with no parameters and return type
        Y3 p = () -> {
            String l[] = {"Test","Best","Quest"};
            return l;
        };

        for(String s: p.getRecords()){
            System.out.println(s);
        }
    }

}
