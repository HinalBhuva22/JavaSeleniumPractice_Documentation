package com.hinal.qa;

public class Box {

	//Counstructor
	
	double width, height, depth;
	
	Box() // default constructer - because not have parameter //1
	
	{
		/*width = 0;
		height = 0;
		depth = 0;
		*/
		width=height=depth = 5;
	}
	
	
	Box(double w, double h, double d)  // another counstructer	//2  
	{
		width=w;
		height=h;
		depth=d;
	
	}
	
	Box(double len )  //3	
	{
		width=height=depth=len;
		
	}
	
	double volume()
	{
		return (width*height*depth);
	}
}
