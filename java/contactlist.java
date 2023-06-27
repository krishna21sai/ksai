import java.util.*;
class contact{
    String phno;
    String name;
    String emailid;
    contact next;

    contact(String phno , String name , String emailid)
    {

        this.phno = phno;
        this.name = name;
        this.emailid = emailid;
    }


}

public class contactlist {

       contact c;
       Scanner in;
    public contactlist() {
       in = new Scanner(System.in);
    }
        contact addConact(contact c)
        {
            
            System.out.print("enter phonenumber, name , emailid");
            String phno = in.nextLine();
            String name = in.nextLine();
            String mail = in.nextLine();
            contact k = new contact(phno,name,mail);
            contact kk ;
            if(c == null)
            {
                c = k;
            }
            else{

                kk = c;

                while(kk.next != null)
                {
                    kk = kk.next;
                }
                kk.next = k;
            }
            return c;
        }

        void searchContact(String name)
        {
            contact kk = c;
            int pp = 0;
            
            while( kk!= null)
            {
                if(kk.name.equals(name))
                {
                    System.out.println(kk.name + " "+kk.phno+" "+kk.emailid);
                    pp = 1;
                    break;
                }
                kk = kk.next;
            }
            if(pp == 0)
            {
                System.out.println("Not Found!!!!!");
            }
        }

        void displayContact()
        {

             contact kk = c;
            while( kk != null)
            {
                System.out.println(kk.name + " "+kk.phno+" "+kk.emailid);
                kk = kk.next;
            }
        }
        public static void main(String[] args)
        {
            contactlist o = new contactlist();
            o.c = null;
            
            o.c = o.addConact(o.c);
            o.c = o.addConact(o.c);
            o.c = o.addConact(o.c);
            System.out.print("enter name u want the search details");
            String pp = o.in.nextLine();
        
            o.searchContact(pp);
            o.displayContact();
        }

}
