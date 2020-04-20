/*Type of Inheritance
 1. Signal Inheritance
 2. Multilevel Inheritance
 3.Herarical Inheritance

 this is Signal and Multileal Inheritance Example 
*/
package oops;

public class Inheritance_type2 {

}

class a
{
	void showa()
	{
		System.out.println(" a class method");
	}
}
class b extends a
{
	void showb()
	{
		System.out.println("b class method");
	}
	
}
class c extends b
{
void showc()
{
	System.out.println("c class method");
}

public static void main (String[] args)
{
	a ob1=new a();
	ob1.showa();
	
	b ob2=new b();
	ob2.showa();
	ob2.showb();
	
	c ob3=new c();
	ob3.showa();
	ob3.showb();
	ob3.showc();
}}