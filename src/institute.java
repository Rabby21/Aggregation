import java.io.*;
import java.util.*;
public class institute{
	String instName;
	
	//institute institutes=new institute(instName);
	
	Scanner input = new Scanner(System.in);

	public institute(String instName) {
		this.instName = instName;
	}

	public String getInstName() {
		return instName;
	}

	public void setInstName(String instName) {
		this.instName = instName;
	}
	public void showDept()
	{
		System.out.println("Enter your department:");
		String deptName = input.next();
		System.out.println("enter your institute: ");
		String instName= input.next();
		
	}

}
