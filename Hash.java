import java.lang.*;

class Demo
{

}
class Hash
{
    public static void main(String arg[]) throws Exception
    {
        String str1 = "Tushar";
        String str2 = "Tushar";
        String str3 = "Jadhav";
        Demo dobj = new Demo();

        System.out.println("Hashcode of Str1 is:"+str1.hashCode());
        System.out.println("Hashcode of Str1 is:"+str2.hashCode());
        System.out.println("Hashcode of Str1 is:"+str3.hashCode());
        System.out.println("Hashcode of Str1 is:"+dobj.hashCode());
    }
}