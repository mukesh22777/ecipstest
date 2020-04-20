
// Example 
package oops_Concept;

public class Animal2 {
public void eat() {
	System.out.println("I ma eating");
}
	public static void main(String[] args) {
		
	System.out.println("1");
	
	Animal2 buzo = new Animal2();
	buzo.eat();
	buzo.run();
	
	Animal2 aa=new Animal2();
	aa.run();
	aa.eat();
	
	Birds sp=new Birds();  // we can create new object and  call to other class
	sp.fly();
}
	public void run() {
	System.out.println("I am runnung");
	}
}
class Birds 
{
	void fly()
	{
		System.out.println("I am Flying");
	}
}


