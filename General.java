package com.bayamp.math.calc;

/*
 * Author for General Java Program
 * Name Sindhuja
 */

public class General {

	// Global Variable

	public static int asciiName(char character) {

		int ascii = (int) character;

		System.out.println(" I want to know the ascii value for character a ");
		System.out.println(" The value for character 'a' is " + ascii);

		return ascii;
	}

	public static int calculateAverage(int noOfStudents, int marksOfStudent1,
			int marksOfStudent2, int marksOfStudent3) {

		int average = (marksOfStudent1 + marksOfStudent2 + marksOfStudent3
				/ noOfStudents);
		return average;
	}

	public static double squareRoot(int inputNumber) {

		double result = Math.sqrt(inputNumber);

		return result;

	}

	public static int calculateExponential() {

		System.out.println("I am in calculateExponential method");

		int base = 5;
		int exponent = 2;

		int result;
		result = base ^ exponent;
		System.out.println(" The Result of Calculate Exponention is " + result);

		return result;

	}

	public static void main(String args[]) {

		int noOfStudents = 3;
		int marksOfStudent1 = 60;
		int marksOfStudent2 = 35;
		int marksOfStudent3 = 85;

		calculateAverage(noOfStudents, marksOfStudent1, marksOfStudent2,
				marksOfStudent3);

		int inputNumber = 6;
		squareRoot(inputNumber);

		char character = 'a';
		asciiName(character);

		calculateExponential();

		double noOfPlayersInGroupA = 30;
		double noOfPlayersInGroupB = 20;

		Multiplication myObjectName = new Multiplication();

		double totalNoOfPlayers = myObjectName.multipleTwoGroup(
				noOfPlayersInGroupA, noOfPlayersInGroupB);

	}

}
