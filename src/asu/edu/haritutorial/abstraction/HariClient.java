package asu.edu.haritutorial.abstraction;

public class HariClient {
	
	public static Car sendCar(String carType) {
		if(carType.equals("S")) {
			return new Sedan();
		}else
			return new Hatchback();
	}
	
	public static void main(String []args) {
		Car c = sendCar("S");
		c.start();
		c = sendCar("sdfjgdf");
		c.start();	
	}

}
