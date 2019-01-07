package asu.edu.haritutorial.abstraction;

public class Sedan implements Car {
	public void sedanStart() {
		start();
	}
	
	public void start() {
		System.out.println("Sedan Car started");
	}
	
	public void stop() {
		System.out.println("Sedan Car stopped");
	}
	
	public void left() {
		System.out.println("Sedan Car left");
	}
	
	public void right() {
		System.out.println("Sedan Car right");
	}
}
