package asu.edu.haritutorial.runtimePolymorphism;

public class DriverClass {

	public static void main(String [] args) {
		ParentClass p = new ChildClass();
		ChildClass c = new ChildClass();
		ParentClass c2 = new ChildClass2();
		
		p.doSomething();// Iam parent
		c.doSomething();// Iam Child 
		c2.doSomething();// I am child2
		
		p.doSomething();// I am parent
		p.doSomething2(); // I am I am Parent2
		
		//c.doSomething();
		//c.doSomething2();
	}
	
}
