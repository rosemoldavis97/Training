package inheritanc;

public class Salary extends Calculate{
	float total;
	public void totSal() {
		super.basic();
		super.cal();
		total=pay+hra+bonus-pf-ded;
		System.out.println("Total salary is "+total);
	}
	public void salSlip() {
		System.out.println("salary slip");
		System.out.println("Basic pay       : "+pay);
		System.out.println("Deduction       : "+ded);
		System.out.println("hra             : "+hra);
		System.out.println("pf              : "+pf);
		System.out.println("Bonus           : "+bonus);
		System.out.println("Total salary    : "+total);
	}
	public static void main(String[] args) {
		Salary s=new Salary();
		s.totSal();
		s.salSlip();	
	}
}
