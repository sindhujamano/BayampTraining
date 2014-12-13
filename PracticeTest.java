package com.bayamp.math.calc;


import org.testng.annotations.*;

public class PracticeTest {
	
	@Test
	public void myTest(){
		
		int number1 = 30;
		int number2 = 40;
		
		
	if(number1>number2){
		
		System.out.println(" number1 is greater than number2");
		
	} else {
		
		System.out.println(" I dont know what to say here");
		
	}
		
	}	
		
	@Test
	public void myTest1(){
		
		int number1 = 30;
		int number2 = 40;
		
		compareNumbers(number1, number2);
		
		
	if(number1>number2){
		System.out.println(" The number1 is greater than number2");
		
	}else if (number1<number2) {
	     System.out.println(" Either number1 is less than number2 or the both numbers are equals");
	
	} else if (number1 ==number2){
		System.out.println("Both the numbers are equals");
	     
	     
	}else {
		System.out.println(" Dont know why need this ");
		
	}
	
	}	
	
	
	/*
	 * This method compares two numbers and returns a boolean (true or false)
	 * This method returns 1 if the first number is greater than the second number,
	 * it returns -1 if number 1 is less than the second number
	 * if they are equal then the method returns zero
	 */ 
	
	
	
	
	
	
	
	private int compareNumbers(int num1, int num2){
		
		
		if(num1>num2){
			System.out.println(" The number is greater than number2");
			return 1;
		}else if (num1<num2) {
		     System.out.println(" Either number1 is less than number2 or the both numbers are equals");
		    return 0;
		} else if (num1 ==num2){
			System.out.println("Both the numbers are equals");
		     return 0;
		     
		}else {
			System.out.println(" Dont know why need this ");
			
		}
		
		return  1;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
