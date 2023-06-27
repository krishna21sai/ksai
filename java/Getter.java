

class Car{
    

    private String door ;
    private String engine ;
    private String drives ;
    private int speed;

    public void setspeed(int speed){
        this.speed = speed;
    }
    public int getspeed()
    {
        return speed;
    }
    public String doors()
    {
         return door;
    }
}
class Getter
{
    public static void main(String[] arsg) {
    
            Car car = new Car();
            car.setspeed(10);
            System.out.println(car.getspeed());
            System.out.println(car.doors());

    }
}
