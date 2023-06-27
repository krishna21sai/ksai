class student
{
    int a;
    String s;
    student(int a,String s)

    {
        System.out.println(a+" "+s);
    }
}
class main{
    public static void main(String[] args)
    {
        student obj[]=new student[3];
        obj[0]=new student(1,"jsj");
        obj[1]=new student(2,"bjd");
        obj[2]=new student(3,"hki");

    }
}