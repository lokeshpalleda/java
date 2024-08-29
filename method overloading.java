public class Method{
void  pro(int a,int b)
{
System.out.println("product is "+(a*b));
}
void pro(int a,int b,int c)
{
System.out.println("product is "+(a*b*c));
}
public static void main(String args[])
{
Method obj=new Method();
obj.pro(4,5);
obj.pro(12,10,1);
}
}
