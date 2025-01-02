import java.lang.*;

class Demo
{
    public int i;
    public final int j = 20;
    public final int k;

    public Demo()
    {
        this.i = 10;
        this.k = 30;
    }
    public Demo(int x , int y)
    {
        this.i = x;
        this.k = y;
    }
    public void fun()
    {
        i++;
      //  j++;      //NA
       // k++;      //NA
    }
}
class final1
{
    public static void main(String arr[])
    {
        Demo obj1 = new Demo();
        obj1.fun();
        System.out.println(obj1.i);
        System.out.println(obj1.j);
        System.out.println(obj1.k);

        Demo obj2 = new Demo(60,70);
        obj2.fun();

        System.out.println(obj2.i);
        System.out.println(obj2.j);
        System.out.println(obj2.k);


    }
}