import java.lang.*;

class Base
{
    public void fun()
    {
        System.out.println("Inside Base fun");
    }
    public final void gun()
    {
        System.out.println("Inside Base gun");
    }
}
class Derived extends Base
{
    public void fun()               //override
    {
        System.out.println("Inside Derived fun");
    }
    /* public void gun()
    {
        System.out.println("Inside Derived gun");
    }*/
}
class Final2
{
    public static void main(String arg[])
    {
        Base obj = new Derived();

        obj.fun();
        obj.gun();
    }
}