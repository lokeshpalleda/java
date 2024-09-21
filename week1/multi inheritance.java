//multi inheritance
import java.util.*;
class Phy
{
	public void Phy()
	{
		System.out.println("physics");
	}
}
class Mat extends Phy
{
	public void Mat()
	{
		System.out.println("maths");
	}
}
class Che extends Mat
{
	public void Che()
	{
		System.out.println("chemistry");
	}
}
class Multi extends Che
{
	public void Multi()
	{
		System.out.println("multi inheritance");
	}
	public static void main(String []args)
	{
		Multi obj=new Multi();
		obj.Multi();
		obj.Che();
		obj.Mat();
		obj.Phy();
	}
}
