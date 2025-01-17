package inheritanc;
import java.util.Scanner;

public class BasicInfo {
	float pay,ded,bonus;
	Scanner sc=new Scanner(System.in);
	public void basic() {		
		System.out.println("Enter your basic pay");
		pay=sc.nextFloat();
		System.out.println("Enter your deduction");
		ded=sc.nextFloat();
		System.out.println("Enter your bonus");
		bonus=sc.nextFloat();
	}

}
