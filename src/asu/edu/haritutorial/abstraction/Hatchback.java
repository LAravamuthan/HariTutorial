package asu.edu.haritutorial.abstraction;

public class Hatchback implements Car {
	public void start() {
		System.out.println("Hatchback Car started");
	}
	
	public void stop() {
		System.out.println("Hatchback Car stopped");
	}
	
	public void left() {
		System.out.println("Hatchback Car left");
	}
	
	public void right() {
		System.out.println("Hatchback Car right");
	}
}
