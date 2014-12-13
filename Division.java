package com.bayamp.math.calc;



public class Division {

	public static int divisionOfPlayers() {

		int noOfPlayers = 24;
		int noOfTeams = 2;

		System.out.println("Divide the number of players into a team" + noOfPlayers);
		System.out.println(" I have two different teams" + noOfTeams);

		int noOfPlayersInEachTeam = noOfPlayers / noOfTeams;

		System.out.println(" The Result in Each Team" + noOfPlayersInEachTeam);

		return noOfPlayersInEachTeam;

	}

	private static float divideTheFruits() {

		float onedozenOfMangoes = 12;
		float noOfPeopleInTheFamily = 3;

		System.out.println(" I have a dozen of mangoes " + onedozenOfMangoes);
		System.out.println(" the total number of people in the family"+ noOfPeopleInTheFamily);

		float noOfMangoesForEachMember = onedozenOfMangoes / noOfPeopleInTheFamily;

		System.out.println(" The Result in Each Team"+ noOfMangoesForEachMember);

		return noOfMangoesForEachMember;

	}

	public int divisionOfPlay(int noOfPlayers, int noOfTeams) {

		int noOfPlayersInEachTeam = noOfPlayers / noOfTeams;

		return noOfPlayersInEachTeam;

	}

	public float divideTheFruit(float onedozenOfMangoes,float noOfPeopleInTheFamily) {

		float noOfMangoesForEachMember = onedozenOfMangoes/ noOfPeopleInTheFamily;

		return noOfMangoesForEachMember;

	}

	public static void main(String args[]) {

		divisionOfPlayers();
		divideTheFruits();

		Addition myObject = new Addition();

		int balls = 400;
		int bats = 200;

		int total = balls + bats;

		System.out.println(" I am in addition method");
		System.out.println(" Addition of balls and bats is " + total);

		double result = myObject.addBallsAndBats(balls, bats);

		Addition myUpdate = new Addition();

		float num1 = 36;
		float num2 = 44;

		float Total = num1 + num2;

		System.out.println(" The Total Of num1 and num2 is " + total);

		double Result = myUpdate.addTwoNumbers(num1, num2);

	}

}