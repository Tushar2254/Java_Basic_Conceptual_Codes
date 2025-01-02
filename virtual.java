import java.lang.*;

class Base 
{
    public int i;
    public int j;

    public void fun()
    {
        System.out.println("Inside Base fun\n");
    }
    public void gun()
    {
        System.out.println("Inside Base gun\n");
    }
    public void mun()
    {
        System.out.println("Inside Base mun\n");
    }
}
class Derived extends Base
{
    public int x;
    public int y;

    public void fun()
    {
        System.out.println("Inside Derived fun\n");
    }
    public void gun()
    {
        System.out.println("Inside Derived gun\n");
    }
    public void run()
    {
        System.out.println("Inside Derived run\n");
    }
}

class virtual
{
    public static void main(String a[])
    {
        System.out.println("Inside main\n");

        Base obj = new Derived();

        obj.fun();
        obj.gun();
        obj.mun();
    }
}