import java.util.Random;

class Student{
    int rollno;
    String name;
    int age;

    public Student(){
        super();
    }

    public Student(int rollno, String name, int age){
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
    }
}

public class Intro5 {
    public static void main(String[] args) {

        /*One-dimentional array */
        int t[] = {5,2,3};
        for(int i : t){
            System.out.println(i);
        }

        int p[] = new int[3];
        p[0] = 11;
        p[1] = 18;
        p[2] = 74;

        for(int i : p){
            System.out.println(i);
        }

        /*Multi dimentional array */
        System.out.println("Multi dimentional array:\n");
        int x[][] = new int[2][3];

        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                x[i][j] = new Random().nextInt(1,100);
                System.out.print(x[i][j]+" ");
            }
            System.out.println("\n");
        }

        /*Jaggered Array */
        System.out.println("Jaggered Array: \n");
        int y[][] = new int[3][];

        y[0] = new int[2];
        y[1] = new int[3];
        y[2] = new int[4];
        
        for(int i =0; i < y.length;i++){
            for(int j =0;j < y[i].length;j++ ){
                y[i][j] = new Random().nextInt(1,100);
            }
        }

        for(int n[]:y){
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println("");
        }

        /*Three dimentional array*/
        System.out.println("Three dimentional array: \n");
        //int m[][][] = {{{1,2,3},{4,5,6}},{{7,8,9},{45,25,64}}};
        int m[][][] = new int[2][3][2];
        for(int i=0;i<m.length;i++){
            for(int j=0; j<m[i].length;j++){
                for(int k=0;k<m[i][j].length;k++){
                    m[i][j][k] = new Random().nextInt(1,100); //i-z axis, j-rows, k-columns
                    System.out.print(m[i][j][k] + " ");
                }
                System.err.println();
            }
            System.out.println();
        }

        /*Array of Objects*/
        System.out.println("Array of Objects: \n");
        Student s[] = new Student[]{new Student(1,"A",11),new Student(2, "B", 15)};

        for(int i=0;i<s.length;i++){
            System.out.println(s[i].toString());
        }

        s[0].rollno =14;
        s[0].name = "Allu";
        s[0].age = 15;
        
        s[1].rollno = 15;
        s[1].name = "Ballu";
        s[1].age = 16;
        
        /*Enhance For-Loop */
        System.out.println("Enhance For-Loop: \n");
        for(Student k : s){
            System.out.println(k.toString());
        }
    }
}
