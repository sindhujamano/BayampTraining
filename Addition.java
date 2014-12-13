package com.bayamp.math.calc;

public class Addition {

	// Global Variable

	// function definitions

	public static int addBallsAndBats() {

		int noOfBalls = 40;
		int noOfBats = 50;
		int total = (noOfBalls + noOfBats);

		System.out.println(" I am in addition method");
		System.out.println(" Addition of balls and bats is " + total);

		return total;

	}

	private static float addTwoNumbers() {

		float num1 = 100;
		float num2 = 200;
		float total = num1 + num2;

		System.out.println(" The first Number is " + num1);
		System.out.println(" The Second Number is " + num2);
		System.out.println(" The Total Of num1 and num2 is " + total);

		return total;
	}

	public double addBallsAndBats(int balls, int bats) {

		int total = balls + bats;

		return total;

	}

	public double addTwoNumbers(float num1, float num2) {

		float total = num1 + num2;

		return total;

	}

	public static void main(String args[]) {

		addBallsAndBats();
		addTwoNumbers();

	}

}
