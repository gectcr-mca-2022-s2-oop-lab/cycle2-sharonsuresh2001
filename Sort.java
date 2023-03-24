import java.util.Arrays;
import java.util.Scanner;
public class Sort {

	public static void main(String[] args) {
		int n,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of elements in the array:");
		n=sc.nextInt();
		String animals[]=new String[n];
		System.out.println("enter the string:");
		Scanner sc1=new Scanner(System.in);
		for(i=0;i<n;i++)
		{
			animals[i]=sc1.nextLine();
		}
		for(i=0;i<n;i++) {
			for(j=i+1;j<n;j++) {
				if(animals[i].compareTo(animals[j])>0)
				{
					String temp=animals[i];
					animals[i]=animals[j];
				    animals[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(animals));
	}
}