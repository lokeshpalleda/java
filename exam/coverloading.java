import java.util.*;
class A
{
    A()
    {
        System.out.println("constructor");
    }
    A(int n)
    {
        System.out.println(n);
    }
    public static void main(String []args)
    {
        A obj1=new A();
        A obj2=new A(10);
    }
}
