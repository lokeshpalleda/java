//super keyword
import java.util.*;
class Phy
{
	static float marks=96;
}
class Super extends Phy
{
static float marks=97;
	void display()
	{	
		System.out.println(super.marks);
	}
	public static void main(String []args)
	{
		Super obj=new Super();
		obj.display();
	}
}
