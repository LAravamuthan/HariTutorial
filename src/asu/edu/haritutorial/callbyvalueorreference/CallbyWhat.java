package asu.edu.haritutorial.callbyvalueorreference;

public class CallbyWhat {

	public static void main(String[] args) {
		Integer i = 1000;
		System.out.println(i);
		changeInteger(i);
		System.out.println(i);
		int j = 500;
		System.out.println(j);
		changeInt(j);
		System.out.println(j);
		
	}

	public static void changeInteger(Integer i) {
		i = 1001;
	}
	
	public static void changeInt(int i) {
		i = 501;
	}

}
