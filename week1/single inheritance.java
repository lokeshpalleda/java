//single inheritance
import java.util.*;
class Double
{
	public void Double()
	{
		System.out.println("double");
	}
}
class Single extends Double
{
	public void Single()
	{
		System.out.println("single");
	}
	public static void main(String []args)
	{
		Single obj=new Single();
		obj.Double();
		obj.Single();
	}
}
