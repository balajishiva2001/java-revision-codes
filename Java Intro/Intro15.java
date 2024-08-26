import java.io.*;
import java.util.*;

public class Intro15 {
    public static void main(String[] args){

        /*
         * BufferedReader always takes the input in the String form
         */
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.println("Enter the num: ");
        try {
            int k = Integer.parseInt(br.readLine());
            System.out.println(k);
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }

        /*
         * Using
         */
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the int: ");
       System.out.println(sc.nextInt());
       System.out.println("Enter the long: ");
       System.out.println(sc.nextLong());
       System.out.println("Enter the double: ");
       System.out.println(sc.nextDouble());
       System.out.println("Enter the word: ");
       System.out.println(sc.next());
       System.out.println("Enter the line: ");
       System.out.println(sc.nextLine());
       System.out.println("Enter the float: ");
       System.out.println(sc.nextFloat());
       System.out.println("Enter the short: ");
       System.out.println(sc.nextShort());
       System.out.println("Enter the byte: ");
       System.out.println(sc.nextByte());
       
       sc.close();
        
    }
}
