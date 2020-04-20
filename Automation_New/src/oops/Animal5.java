// Inheritance using  extends keyword 

// this is parent and chield relationship 
// all properly of Animal class coming  on to Dog class
// disadvantage : if we can change code in parent class  then child class effected parent class code
// make relationship  between Dog and Animal class  relationship name like :  Dog  "IS-A"  Animal
package oops;

public class Animal5 {  //parent class
	void eat()
	{
		System.out.println(" I am eating");
	}
	

}
class Dog extends Animal5   // Child class
{
	public static void mail (String[]args)
	{
		Dog d=new Dog();
		d.eat();
	}
}