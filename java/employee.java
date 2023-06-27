import java.util.*;

class employ{

    private String employid;
    private String name;
    private String designation;
    private double salary;
    private int hourswork;

    employ(String employid,String name ,String designation ,double salary , int hourswork )
    {
        this.employid = employid;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.hourswork=hourswork;
    } 
    void monthlySalaries()
    {
        
    }
    void giverises()
    {

    }
    void payroll()
    {

    }

}







public class employee {
    public static void main(String[] args)
    {
        employ e=new employ("122","sai","ceo",100000,7);
        Scanner in = new Scanner(System.in);
        System.out.println("enter daily extra work hours of the employe");
        int k=in.nextInt();

    }
}
