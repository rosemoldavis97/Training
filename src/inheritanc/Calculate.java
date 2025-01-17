package inheritanc;

public class Calculate extends BasicInfo{
	float hra,pf;
	public void cal() {
		hra=pay*5/100;
		System.out.println("hra is "+hra);
		pf=pay*20/100;
		System.out.println("pf is "+pf);
	}
}