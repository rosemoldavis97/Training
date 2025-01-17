package com.obsqura.training.aggregation;

public class Student {
	String name;
	int rollno;
	Address add;

	public Student(String name, int rollno, Address add) {
		this.name = name;
		this.rollno = rollno;
		this.add = add;
	}
	public void display() {
		System.out.println(name+" "+rollno);
		System.out.println(add.street+" "+add.state+" "+add.pin+" "+add.country);
	}

	public static void main(String[] args) {
		Address a=new Address("Ann street","kerala","India",687451);
		Student s=new Student("rose",24,a);
		s.display();

	}

}
