class exception
{
    public static void main(String[] args) {
        try
        {
            System.out.println(0/1);
        }
        catch(Exception e)
        {
            System.out.println("invalid syntax");
        }
    }
}