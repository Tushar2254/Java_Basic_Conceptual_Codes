import java.lang.*;

class Base
{
    public int x;
    public int y;

    public Base()
    {
        System.out.println("Inside Base constructor\n");
    }
    public void fun()
    {
        System.out.println("Inside Base fun\n");
    }
    public void fun(int a)
    {
        System.out.println("Inside Base with integer argument\n");
    }
    public void gun()
    {
        System.out.println("Inside Base gun\n");
    }
}
class Derived extends Base
{
    public int d;
    public int h;

    public Derived()
    {
        System.out.println("Inside Derived constructor\n");
    }
    public void sun()
    {
        System.out.println("Inside Derived sun\n");
    }

}

class inheritance1
{
    static
    {
        System.out.println("Inside Static block\n");
    }
    public static void main(String arr[])
    {

    Derived obj = new Derived();
    obj.fun();
    obj.fun(11);
    obj.gun();
    obj.sun();
    }

   // return 0;
}