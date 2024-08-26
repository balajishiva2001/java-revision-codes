import java.io.*;

public class TryWithResources {
    public static void main(String[] args) throws IOException {
        /*
        * Try with resources
        */
        String c = "";
        try(BufferedReader t= new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter the String: ");
            c = t.readLine();
            System.out.println(c);
        }finally{
           System.out.println("completed");
        }
    }
}
