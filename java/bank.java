import java.util.*;
import java.util.Scanner;
class Account
{
    private String Accountnumber;
    private String Accountholdername;
    private double balance;
    
    Account(String Acno , String Acname , int ba)
    {
        this.Accountnumber = Acno;
        this.Accountholdername = Acname;
        this.balance=ba;
    }

    public void Balanceenqiury()
    {
        System.out.println(" ]your Balance is"+balance);
    }
    public void Withdraw(double withdrawlAmount)
    {
        if(withdrawlAmount>balance)
            System.out.println("Insufficient Funds");
        else{
            balance=balance-withdrawlAmount;
            System.out.println("your Balance is"+balance);
        }

    }
    public void Despoite(double am)
    {
        balance=balance+am;
        System.out.println("your Balance is"+balance);

    } 
}
class bank{

    public static void main(String [] args)
    {
        Account acc = new Account("32546474","sai",29000);
        Scanner in = new Scanner(System.in);
            
            System.out.println("enter 1 to balance enquirey");
            System.out.println("enter 2 to withdrawl");
            System.out.println("enter 3 to Deposite");
            int k=in.nextInt();
            if(k==1)
            {
                acc.Balanceenqiury();
            }
            else if(k==2)
            {
                System.out.println("Enter withdrawl amount");
                int amt=in.nextInt();
                acc.Withdraw(amt);
            }
            else if(k==3)
            {
                System.out.println("enter your deppsite amount");
                int amo=in.nextInt();
                acc.Despoite(amo);
            }
    }
}