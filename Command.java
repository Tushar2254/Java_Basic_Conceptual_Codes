import java.lang.*;

class Command
{
    public static void main(String Arg[])
    {
        System.out.println("Number of Commandline argument are :"+Arg.length);

        System.out.println("Enter first number is :"+Arg[0]);
        System.out.println("Enter Second number is :"+Arg[1]);

        int ans = Integer.parseInt(Arg[0])+Integer.parseInt(Arg[1]);
        System.out.println("Addition is :"+ans);

    }
}

// javac Command.java
// java Command 10 11