package com.mohit.Demo;

public class Tyre {

	private String brand;

	Tyre(){
		
	}
	
	public Tyre(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Cool tyre";
	}
	
	
}
