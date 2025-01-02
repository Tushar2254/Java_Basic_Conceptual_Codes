import java.lang.*;

abstract class Demo
{
    public int i,j;

    public Demo()
    {
        System.out.println("Inside Demo constructor");
    }
    public void fun()       //concrete
    {
        System.out.println("Inside Demo fun");
    }
    public abstract void gun();         //abstarct
}
class Hello extends Demo
{
    public int x,y;

    public Hello()
    {
        System.out.println("Inside Hello constructor");
    }
    public void mun()       //concrete
    {
        System.out.println("Inside Hello mun");
    }
    public void gun()       //concrete
    {
        System.out.println("Inside Hello gun");
    }
}

class AbstractDemo
{
    public static void main(String arg[])
    {
    Hello hobj = new Hello();

    hobj.fun();
    hobj.mun();
    hobj.gun();
    }
}