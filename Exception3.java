import java.lang.*;
import java.util.*;

class Exception3
{
    public static void main(String ar[])
    {
        int Arr[]={10,20,30,40,50};
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Index");
        int Index = sobj.nextInt();

        System.out.println("Index is:"+Arr[Index]);

        sobj.close();
    }
}