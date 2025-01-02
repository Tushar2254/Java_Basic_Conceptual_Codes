import java.lang.*;
import java.io.*;

class Input3
{
    public static void main(String arg[]) throws IOException
    {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);

        System.out.println("Enter string:");
        String str = bobj.readLine();

        System.out.println("Enter Integer:");
        int no = Integer.parseInt(bobj.readLine());

        System.out.println("Enter Float:");
        float f = Float.parseFloat(bobj.readLine());

        System.out.println("Enter Double:");
        double d = Double.parseDouble(bobj.readLine());

        System.out.println("Eneterd string is : "+str);
        System.out.println("Eneterd integer is : "+no);
        System.out.println("Eneterd float is : "+f);
        System.out.println("Eneterd double is : "+d);
        
    }
}