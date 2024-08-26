public class Intro3 {

    public static void main(String[] args) {

        int a=3;
        int b=4;

        /*conditional statements (if)*/
        System.out.println("conditional statements (if): \n");

        if(a>b){
            System.out.println("a is greater than b");
        }

        System.out.println("\n");
        /*conditional statements (if-else)*/
        System.out.println("conditional statements (if-else): \n");
        if(a>b){
            System.out.println("a is greater than b");
        }else{
            System.out.println("a is less than b");
        }

        System.out.println("\n");
        /*conditional statements (if-else-if)*/
        System.out.println("conditional statements (if-else): \n");
        if(a>b){
            System.out.println("a is greater than b");
        }else if(a<2){
            System.out.println("a is less than 2");
        }else{
            System.out.println("a is less than b and greater than 2");
        }

        System.out.println("\n");
        /*Ternary conditional statements (? :)*/
        System.out.println("Ternary conditional statements (? :) : \n");
        System.out.println(a>b ? "a is greater than b" : "a is less than b");
    
        System.out.println("\n");
        /*Switch Staement*/
        int t = 0;
        System.out.println("Switch Staement : \n");
        switch (t) {
            case 0:
                System.out.println(true);
                break;

            case 1:
                System.out.println(false);
                break;
        
            default:
                System.out.println("default block");
                break;
        }

        System.out.println("\n");
        /*While loop (condition based loop)*/
        System.out.println("While loop (condition based loop): \n");

        int n = 10;

        while(n<=15){
            System.out.println(n++);
        }

        System.out.println("\n");
        /*do-While loop (condition based loop)*/
        System.out.println("do-While loop (condition based loop): \n");
        do{
            System.out.println(n--);
        }
        while(n>=10);

        System.out.println("\n");
        /*for loop (fixed iteration loop)*/
        System.out.println("for loop (fixed iteration loop): \n");
        for(int i=1; i<=5;i++){
            System.out.println(i);
        }
    }
    
}
