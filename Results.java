package com.qa.opexercise;

public class Results {
	
	int physics = 80;
	int chemistry = 110; 
	int biology = 105; 
	int total;
	double percentage;
	
	public void results() {
		System.out.println("Physics exam score: " + physics);
		System.out.println("Chemistry exam score: " + chemistry);
		System.out.println("Biology exam score: " + biology);
		System.out.println("Total marks is: " + (physics+chemistry+biology));
	}

	public void percentage() {
		System.out.println("Score Percentage: " + ((physics+chemistry+biology)*(100))/(450));
	}
		
	
	
	
}
