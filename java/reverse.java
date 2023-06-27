import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        StringTokenizer k=new StringTokenizer(s, " ");
        Stack<String> stk=new Stack<String>();
        while(k.hasMoreTokens())
        {
            stk.push(k.nextToken());

        }
        while(!stk.isEmpty())
        {
            System.out.print(stk.pop()+" ");
        }
    }
}
