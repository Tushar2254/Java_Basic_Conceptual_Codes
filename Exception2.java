import java.util.*;

class Exception2
{
    public static void main(String ar[])
    {
        int Ans = 0, no1 = 0 , no2 = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number:");
        no1 = sobj.nextInt();

        System.out.println("Enter Second number:");
        no2 = sobj.nextInt();

        try
        {
            Ans = no1/no2;      //exception prone code
        }
        catch(ArithmeticException obj)
        {
            System.out.println("Exception occurs:"+obj);
        }
        finally
        {
            sobj.close();
        }

        System.out.println("Division is:"+Ans);
        
    }
}
