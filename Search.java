import java.util.Scanner;
public class Search {

	public static void main(String[] args) {
		int n,x,flag=0,i=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter no of elements in the array:");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter the elements:");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("enter the element to be searched:");
		x=s.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==x)
			{
				flag=1;
				break;
			}
			else 
			{
				flag=0;
			}
		}
		if(flag==1)
		{
			System.out.println("element found at position:"+(i+1));
		}
		else {
			System.out.println("element not found in this array !");
		}
		
   
	}

}
