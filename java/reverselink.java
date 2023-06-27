import java.util.*;

class node
{
    int data;
    node next;

    node(int val)
    {
        this.data = val;
    }

}

public class reverselink {

    node head;

    node reverse()
    {
        node temp = head;
        node prev = null;
        node next;
        while(temp != null)
        {
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }
    void newnode(int value)
    {

        node n = new node(value);

        if(head == null)
        {
            head = n;
        }
        else{
            node temp = head;

            while( temp.next != null)

            {

                temp = temp.next;
            }
            temp.next = n;
        }
    }

    void printlist()
    {

        node temp = head;
         while( temp.next != null){

            System.out.println(temp.data);
            temp = temp.next;
         }
         System.err.println(temp.data);
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        reverselink kk = new reverselink();

        kk.newnode(10);
        kk.newnode(20);
        kk.newnode(30);
        kk.newnode(40);
        kk.newnode(50);
        kk.newnode(60);
        node head = kk.reverse();
        kk.printlist();
    }
}
