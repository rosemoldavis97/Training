package pack2;

public class Rectangle extends Shape{
	void draw() {
		super.draw();
		System.out.println("This is a Rectangle");
}
public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.draw();
}}
		