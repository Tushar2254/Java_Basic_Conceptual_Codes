import java.lang.*;

class Base
{
    public int Add(int i , int j)
    {
        return i + j;
    }
    public int Add(int i , int j , int k)
    {
        return i + j + k;
    }
    public int Add(int i , int j , int k , int l)
    {
        return i + j + k + l;
    }
}
class overloading
{
    public static void main(String arr[])
    {
        Base obj = new Base();

        int ret = 0;
        ret = obj.Add(10,20);
        System.out.println(ret);

        ret = obj.Add(10,20,30);
        System.out.println(ret);

        ret = obj.Add(10,20,30,40);
        System.out.println(ret);
    }
}