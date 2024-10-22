public class Mul
{
    void mul(int a,int b)
    {
        System.out.println(a+b);
    }
    void mul(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
    public static void main(String []args)
    {
        Mul obj=new Mul();
        obj.mul(4,5);
        obj.mul(4,5,6);
    }
}
