package inheritanc;

public class DivisibleByTen extends AdditionResult {

	public void div() {
		
		int result=super.add(45,35 );
		
		if(result%10==0) {
			System.out.println(result+" is divisible by 10 ");}
		else{
			System.out.println(result+" is not divisible by 10");
		}}

	public static void main(String[] args) {
		DivisibleByTen obj=new DivisibleByTen();
	obj.div();
		
	}

}
