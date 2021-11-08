package com.qa.opexercise;

public class Runner {

	public static void main(String[] args) {
		
		System.out.println(Calculator.sum(12,10)); 
		
		System.out.println(Calculator.mult(12,10)); 
		
		System.out.println(Calculator.sub(12,10)); 
		
		System.out.println(Calculator.div(12,10));
		
		Results temp = new Results(); // instantiate class  
		temp.results(); 
		temp.percentage();
		

	}
}
