import java.lang.*;
import java.util.*;

class Demo
{
    public int Division(int no1 , int no2) throws ArithmeticException
    {
        return no1/no2;
    }
}

class Exception5
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first value:");
        int no1 = sobj.nextInt();

        System.out.println("Enter second value:");
        int no2 = sobj.nextInt();

        Demo dobj = new Demo();

        try
        {
            System.out.println("Inside try");
            int Ans = dobj.Division(no1,no2);
            System.out.println("Division is :"+Ans);
        }
        catch(ArithmeticException obj)
        {
            System.out.println("Inside catch");
            System.out.println("Exception is:"+obj);
        }
        catch(Exception obj)
        {
            System.out.println("excep is"+obj);
        }
    }
}