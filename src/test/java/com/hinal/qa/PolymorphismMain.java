package com.hinal.qa;

public class PolymorphismMain {

	public static void main(String[] args) {
		
		// 1 thing have many form 
		
		// through overloading we can achieve polymorphism  polymorphism and method overloading, constructor overloading

		
		Day3Polymorphism poly = new Day3Polymorphism();
		
		poly.sum();  //1
		
		poly.sum(100, 200);  //2
		
		poly.sum(10.5, 20);   //4
		
		poly.sum(10, 15.5);  //3
		
		poly.sum(10, 20, 30);
		
		
		// poly.sum(10.5, 11.5, 20.3); //invalid
		
	}

}
