package com.communication.web.client.model;

public class Car {
	// Properties of the Car model
	private String make; // Manufacturer of the car (e.g., Toyota)
	private String model; // Model of the car (e.g., Corolla)
	private int year; // Year of manufacture
	private String color; // Color of the car
	private double price; // Price of the car

	// Constructor to initialize a Car object
	public Car(String make, String model, int year, String color, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
		this.price = price;
	}

	// Getters and Setters for the properties

	// Get the car's make
	public String getMake() {
		return make;
	}

	// Set the car's make
	public void setMake(String make) {
		this.make = make;
	}

	// Get the car's model
	public String getModel() {
		return model;
	}

	// Set the car's model
	public void setModel(String model) {
		this.model = model;
	}

	// Get the car's year
	public int getYear() {
		return year;
	}

	// Set the car's year
	public void setYear(int year) {
		this.year = year;
	}

	// Get the car's color
	public String getColor() {
		return color;
	}

	// Set the car's color
	public void setColor(String color) {
		this.color = color;
	}

	// Get the car's price
	public double getPrice() {
		return price;
	}

	// Set the car's price
	public void setPrice(double price) {
		this.price = price;
	}

	// Method to display car details
	public void displayCarInfo() {
		System.out.println("Car Details:");
		System.out.println("Make: " + make);
		System.out.println("Model: " + model);
		System.out.println("Year: " + year);
		System.out.println("Color: " + color);
		System.out.println("Price: $" + price);
	}

	// Override toString method to return car details as a string
	@Override
	public String toString() {
		return "Car{" + "make='" + make + '\'' + ", model='" + model + '\'' + ", year=" + year + ", color='" + color
				+ '\'' + ", price=" + price + '}';
	}

}
