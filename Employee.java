import java.util.Scanner;
public class Employee {
	int eid;
	String ename;
	float salary;
	public void getinput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the employee id: ");
		eid=sc.nextInt();
		System.out.println("enter the employee name: ");
		ename=sc.next();
		System.out.println("enter the employee salary: ");
		salary=sc.nextFloat();
		}
	public String toString() {
		return ("Employee id:"+eid+"\nEmployee Name:"+ename+"\nEmployee Salary:"+salary);
		
	}
	

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the no of employees: ");
		int n=in.nextInt();
		Employee e[]=new Employee[n];
		for(int i=0;i<n;i++) {
			e[i]=new Employee();
			e[i].getinput();
		
		}
		System.out.println("enter the employee id: ");
		int no=in.nextInt();
		for(int i=0;i<n;i++) {
			if(e[i].eid==no) {
				System.out.println(e[i]);
			}
		}
		
		in.close();

	}

}
