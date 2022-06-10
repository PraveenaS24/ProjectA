package com.chainsys.springproject.beans;

public class Car {
	public Engine petrolEngine;
	public Wheel alloy;

	public Car() {
		petrolEngine = new Engine();
		alloy = new Wheel();
	}

	public Car(Engine petrolEngine, Wheel alloy) {
		this.petrolEngine = petrolEngine;
		this.alloy = alloy;
	}
	public void start()
	{
		petrolEngine.start();
	}
	public void rotate()
	{
		alloy.rotate();
	}
	
}