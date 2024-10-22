import java.util.*;
class A
{
   float s=100.0f;
}
class B extends A
{
    float s=200.0f;
    void display()
    {
        System.out.println(super.s);
    }
}
public class main
{
    public static void main(String []args)
    {
        B obj=new B();
        obj.display();
    }
}
