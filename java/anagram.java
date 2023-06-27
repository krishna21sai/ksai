import java.util.*;
class anagram {
    public static void main(String[] args ) {
        Scanner in =new Scanner(System.in);
        String h=in.nextLine();
        String k=in.nextLine();
        char[] a=h.toCharArray();
        char[] b=k.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        h=Arrays.toString(a);
        k=Arrays.toString(b);
        System.out.println(String.valueOf(ajh));
        if(h.equals(k))
        System.out.println("pan");
        else
        System.out.println("not");
        
    }
}
