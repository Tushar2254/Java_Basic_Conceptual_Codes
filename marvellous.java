import java.lang.*;

class Demo
{
    public int x;
    public int y;

    public Demo()
    {
        this.x=0;
        this.y=0;
    }
    public Demo(int i , int j)
    {
        this.x = i;
        this.y = j;
    }

    public void fun()
    {
        System.out.println("Inside fun\n");
    }
     public void gun()
    {
        System.out.println("Inside gun\n");
    }

}
class marvellous
{
    public static void main(String arr[])
        {
            System.out.println("Inside main");
            Demo obj = new Demo();
            obj.fun();      // fun(obj);
            obj.gun();     // gun(obj);
            System.out.println(obj.x);

            Demo objx = new Demo(11,21);
            objx.fun();      // fun(obj);
            objx.gun();     // gun(obj);
            System.out.println(objx.x);
        }

    
}