import java.lang.*;

class Employee      //class employee extends object
{
    public String name;
    public int Salary;

    public Employee(String str , int iNo)
    {
        this.name = str;
        this.Salary = iNo;
    }
    public String toString()
    {
        return "Employee name is :"+name+"Salary is:"+Salary;

    }
}

    class Object1
    {
        public static void main(String Arg[])
        {
            Employee eobj = new Employee("Tushar" , 21000);
            System.out.println(eobj.toString());
        }

    }
