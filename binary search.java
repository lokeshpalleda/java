import java.util.*;
public class Binary
{
	static void sort(int ar[])
	{
		int n=ar.length;
		int temp=0;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(ar[i]>ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
	}
	static void search(int ar[])
	{
		System.out.println("enter value to find");
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		int s=0;
		int n=ar.length;
		int e=n-1;
		int mid;
		boolean found=false;
		while(s<e)
		{
			mid=(s+e)/2;
			if(key==ar[mid])
			{
				System.out.println("key found at "+(mid+1));
				found = true;
				break;
			}
			else if(key<ar[mid])
			{
				e=mid-1;
			}
			else
			{
				s=mid+1;
			}
		}
		if(!found)
		{
		    System.out.println("key not found");
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value:");
		int n=sc.nextInt();
		int []ar=new int[n];
		System.out.println("enter the values"); 
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		sort(ar);
		System.out.println("after sorting\t");
		for(int i=0;i<n;i++)
		{
			System.out.println(ar[i]);
		}
		search(ar);
	}
}	
