package asu.edu.haritutorial.instanceofobject;

public class DriverClass {
	
	public static void main(String [] args) {
		String name = "Hari";
		Integer i = 687643;	
		checkIfString(name);
		checkIfString(i);
		
	}
	
	public static void checkIfString(Object obj) {
		System.out.println(obj instanceof Integer);
	}

}
