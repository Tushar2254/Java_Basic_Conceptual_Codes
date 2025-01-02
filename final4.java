import java.lang.*;

final class Base 
{
    public void fun()
    {
        System.out.println("Inside base fun");
    }
}
class Derived
{
    public Base bobj = new Base();      //composition
    public void gun()
    {
        System.out.println("Inside Derived gun");   
    }
}

class Final4
{
    public static void main(String arg[])
    {
        Derived dobj = new Derived();
        dobj.bobj.fun();
        dobj.gun();
    }
}