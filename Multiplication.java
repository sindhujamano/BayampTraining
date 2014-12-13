package com.bayamp.math.calc;

/*
 * @author Sindhu
 * Home Work on 23/10/14
 */

public class Multiplication {

	// Global Variable

	// Function Definition

	public static int multipleTwoGroup() {

		int noOfPlayersInGroupA = 10;
		int noOfPlayersInGroupB = 11;

		System.out.println(" The First Team has " + noOfPlayersInGroupA + " players");
		System.out.println(" The Second Team has " + noOfPlayersInGroupB + " players");

		int totalNoOfPlayers = (noOfPlayersInGroupA * noOfPlayersInGroupB);
		return totalNoOfPlayers;
	}

	private static int multipleTwoTeams(int noOfPlayersInGroupA,
			int noOfPlayersInGroupB) {

		int totalOfTeamAAndTeamB = (noOfPlayersInGroupA * noOfPlayersInGroupB);

		return totalOfTeamAAndTeamB;
	}

	public double multipleTwoGroup(double noOfPlayersInGroupA, double noOfPlayersInGroupB) {

		double totalNoOfPlayers = (noOfPlayersInGroupA * noOfPlayersInGroupB);

		return totalNoOfPlayers;

	}

	public static void main(String args[]) {

		multipleTwoGroup();

		int noOfPlayersInGroupA = 2;
		int noOfPlayersInGroupB = 14;

		multipleTwoTeams(noOfPlayersInGroupA, noOfPlayersInGroupB);

		Subtraction MyObject1 = new Subtraction();

		int pocketMoney = 100;
		int spentForShopping = 80;
		
		System.out.println(" The pocket money for the month is "+  pocketMoney);
		System.out.println(" I have spent for shopping is " + spentForShopping);
		System.out.println(" The balance amount in hand is "+  (pocketMoney - spentForShopping));
		
		
		int totalBalance = MyObject1.remainingBalanceAmount(pocketMoney,
				spentForShopping);

	}
}
