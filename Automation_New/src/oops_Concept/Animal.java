/*
- object oriented programming System/ Structure
- oops is a methodology
- 6 main pilers  of oops
1. calss  2.object and method  3.Inheritance   4. plomarphisam   5. Attraction   6. Encaptolation 
=================================================================================================================
	eat						run
  (Method)                (Method)
				Animal   					// class is a collection of object 
               (classs)						// class is a not real entity but is a blue print 
	Dod						Cat
  (Object)                (Object)
  
  Syntax : 
  class CalssName
  {
  method
  custoctors
  field
  block
  variable 
  }
=================================================================================================================
2. Method
- Set of  code with perform a particular task 
- code reuasability  and code optimization 
Syntax :
   return type  MethosName (List of Parameters)  // if return values is null the we can use void 
================================================================================================================
3. Object :
- object is a instance of class
- object is  a real word 
- object is a occupies 
------------------------------------------
object consists 
1. Identy :   Name   (unioq)
2. state/ Attributes : color,  Age
3. Behavior :  eat, run

How to create Object by using new Keyword
Sentex: 
Animal       objectname     =     new Animal();
classname  variable name       class name

Animal buzo=new Animal();
buzo.run                    // using by object call method

*/
// Example 
package oops_Concept;

public class Animal {
public void eat() {
	System.out.println("I ma eating");
}

	public static void main(String[] args) {
		
	System.out.println("1");
	
	Animal buzo = new Animal();
	buzo.eat();
	buzo.run();

}
	public void run() {
	System.out.println("I am runnung");
	}

}
