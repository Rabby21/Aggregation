import java.io.*;
import java.util.*;
public class department {
	private String deptName;

	public department(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public void deptStudentInfo()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of students: ");

		int n = input.nextInt();
		
		Student[] students = new Student[n];
		department[] departments= new department[n];
		institute[] institutes=new institute[n];
		institute inst1=new institute("instName");

		for(int i = 0; i < n; i++){
		System.out.println("Enter Id:");
		int id = input.nextInt();
		System.out.println("Enter Name:");
		String name = input.next();
		System.out.println("Enter your address:");
		String address = input.next();
		students[i] = new Student(id,name,address);
		departments[i]=new department(deptName);
		//institutes[i]=new institute(instName);
		}
		inst1.showDept();
			
            for(int i=0; i<n;i++) {
            	System.out.println("No. "+i+" ");
    			System.out.println("ID: "+students[i].getId());
    			System.out.println("Name: "+students[i].getName());
    			System.out.println("Address: "+students[i].getAddress());
    			System.out.println("Department: "+departments[i].getDeptName());
    			System.out.println("Institute:"+institutes[i].getInstName());
            }
	     
	       
	   }

	}
	

