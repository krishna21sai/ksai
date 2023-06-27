class car {

    private String doors;
    private String engine;
    private String driver;
    private int speed;
    car(String doors,int speed)
    {

         this.doors = doors;
         this.engine = "dd";
         this.driver = "dffg";
         this.speed = speed;
    }
    public void con()
    {
    
        if(doors.equals("closed") && speed == 0)
        {
            System.out.println("stop");
        }
    
    }
}
class cons
{
    public static void main(String[] args)
    {
 
        car Car=new car("closed",0);
        Car.con();
    }
}