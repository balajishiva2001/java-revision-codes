public class Intro6 {
    public static void main(String[] args) {
        /*Immutable String*/
        System.out.println("Immutable String: \n");
        char a[] = {'B','A','L','U'};
        System.out.println(new String(a));
        System.out.println(new String(a,1,3));

        byte b[] = {88,87,86};
        System.out.println(new String(b, 0, 2));
        System.out.println(new String(b));
        
        String t = new String("BALAJI");
        System.out.println(t);

        String p = "Balu";
        System.out.println(p);
        System.out.println(p.hashCode());
        System.out.println(p+"Palu");
        System.out.println(p.concat("Kalu"));
        System.out.println("upperCase: "+ p.toUpperCase());
        System.out.println("lowerCase: "+ p.toUpperCase());
        System.out.println("CompareTo: "+ p.compareTo("Test"));
        System.out.println("Contains: "+ p.contains("a"));
        System.out.println("endsWith: " + p.endsWith("u"));
        System.out.println("startsWith: "+ p.startsWith("A"));
        System.out.println("Substing with index: "+ p.substring(2));
        System.out.println("Offset Substring: "+ p.substring(2, 3));
        System.out.println("Length: "+p.length());
        System.out.println( "CharAt: "+ p.charAt(0));
        System.out.println("Index: "+ p.indexOf('a'));
        System.out.println("Index with from: "+ p.indexOf('a', 2));
        System.out.println("Last Index: "+p.lastIndexOf('a'));
        System.out.println("Last Index from: "+ p.lastIndexOf('a', 0));
        System.out.println("Equals: "+ p.equals("BALU"));
        System.out.println("EqualsIgnoreCase: "+ p.equalsIgnoreCase("BALU"));
        String r = "Balu";
        System.out.println(String.format("p hashcode: %d r hashcode: %d  %s",p.hashCode(),r.hashCode(),p == r));
        
        System.out.println("Trim: "+ "hello\u2002".trim() + "\u2002there".trim());
        System.out.println("Strip: " + "hello\u2002".strip() + "\u2002there".strip());
        
        System.out.println("\n Get Bytes: \n");
        for(byte i: p.getBytes()){
            System.out.print(i+ " ");
        }
        System.out.println("\n toCharArray: \n");
        for(char c: p.toCharArray()){
            System.out.print(c+ " "); 
        }
        System.out.println("\n split to String array: \n");
        for(String s:p.split("")){
            System.out.print(s+ " ");
        }

        System.out.println();
        String tt = "";
        System.out.println(String.format("Blank: %s  Empty: %s", tt.isBlank(), tt.isEmpty()));
        
        String ttt = null;
        System.out.println(ttt);
        System.out.println(p.replace('B', 'N'));
        

        /*Mutable String (Not Thread Safe)*/
        System.out.println("Mutable String (Not Thread Safe): \n");
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        sb = new StringBuilder(p);
        System.out.println(sb);
        sb.append(100);
        System.out.println(sb);
        sb.setLength(100);
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);
        sb.insert(0, 'K');
        System.out.println(sb);
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());
        sb.toString();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.setCharAt(0, 'P');
        System.out.println(sb);
        System.out.println(sb.replace(0, 1, "N"));

        /*Mutable String (Thread Safe)*/
        System.out.println("Mutable String (Thread Safe): \n");
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuffer.capacity());

        stringBuffer = new StringBuffer(p);
        System.out.println(stringBuffer);
        stringBuffer.append(100);
        System.out.println(stringBuffer);
        stringBuffer.setLength(100);
        System.out.println(stringBuffer);
        stringBuffer.deleteCharAt(0);
        System.out.println(stringBuffer);
        stringBuffer.insert(0, 'K');
        System.out.println(stringBuffer);
        stringBuffer.ensureCapacity(100);
        System.out.println(stringBuffer.capacity());
        stringBuffer.toString();
        System.out.println(stringBuffer);
        stringBuffer.reverse();
        System.out.println(stringBuffer);
        stringBuffer.setCharAt(0, 'P');
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.replace(0, 1, "N")); 
    }
}