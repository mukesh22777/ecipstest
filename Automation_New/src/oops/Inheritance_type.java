// Type of Inheritance
// 1. Signal Inheritance
// 2. Multilevel Inheritance
// 3.Herarical Inheritance

// this is Signal Inheritance Example 

package oops;

public class Inheritance_type {

}

class A
{
	void showA()
	{
		System.out.println(" a class method");
	}
}
class B extends A
{
	void showB()
	{
		System.out.println("b class method");
	}
	public static void main (String[] args)
	{
		A ob1=new A();
		ob1.showA();
		
		B ob2=new B();
		ob2.showA();
		ob2.showB();
}}