package com.bayamp.math.calc;

public class Subtraction {

	// Global Variable

	// function definitions

	public static int balanceAmount() {

		int budgetAmount = 40;
		int spentForGrocery = 30;
		int totalBalance = (budgetAmount - spentForGrocery);

		System.out.println(" The Budget amount for the month is "+ budgetAmount);
		System.out.println(" The have spent for grocery is " + spentForGrocery);
		System.out.println(" The balanceAmount in hand is "+  (budgetAmount - spentForGrocery));

		return totalBalance;

	}

	public static double subTwoNumbers() {

		float num1 = 200;
		float num2 = 100;

		System.out.println(" The first Number is " + num1);
		System.out.println("The Second Number is " + num2);
		System.out.println(" The Balance Number is " + (num1 - num2));

		float total = num1 - num2;
		return total;
	}

	public int remainingBalanceAmount(int pocketMoney, int spentForShopping) {

		int totalBalance = (pocketMoney - spentForShopping);

		return totalBalance;

	}

	public float subTwoNumber(float num1, float num2) {

		float total = num1 - num2;

		return total;
	}

	public static void main(String args[]) {

		 balanceAmount();
		 subTwoNumbers();
		
				
		Division myGoal = new Division();
		
		int noOfPlayers = 60;
		int noOfTeams = 3;
		
		int noOfPlayersInEachTeam = noOfPlayers / noOfTeams;
		
		System.out.println("How Many players do we have in total is "  + noOfPlayers);
		System.out.println("How many teams do we have in total is " + noOfTeams);
		System.out.println(" We need to divide the players into different teams " + noOfPlayersInEachTeam);
		
        int result = myGoal.divisionOfPlay(noOfPlayers,noOfTeams);
		
        
     }

     }
