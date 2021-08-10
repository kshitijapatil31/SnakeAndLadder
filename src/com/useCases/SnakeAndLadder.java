package com.useCases;

import java.util.Random;

public class SnakeAndLadder {

	public static void main(String[] args) {
		int player1 = 0, player2 = 0, flag = 0;
		// System.out.println(player1);
		int turn1 = 1, turn2 = 2,diceCount=0;
		Random r = new Random();

		while (player1 != 100 && player1 < 100 || player2 != 100 && player2 < 100) {
			if (flag == 0) {
				turn1++;

				int diceRoll = r.nextInt(7);
				diceCount++;
				
				if (diceRoll == 0) {
					diceRoll++;
				}

				System.out.println("player1   " + player1);
				if ((player1 += diceRoll) < 0) {

					player1 = 0;

				} else if ((player1 += diceRoll) == 100) {
					System.out.println("dice"+diceCount);
					System.out.println("You winn the game");
					flag = 1;
					break;
					
				} else if ((player1 += diceRoll) > 100) {
					System.out.println("You will have to wait for the next turn, you have exceeded 100.");
					flag = 1;
					
				} else {
					
					////player1 += diceRoll;
					System.out.println("position "+(player1 += diceRoll));
					int snake = r.nextInt(100);
					int ladder = r.nextInt(100);

					System.out.println("snake"+snake);
					System.out.println("ladder"+ladder);

					if ((player1 += diceRoll) == snake) {
						player1 -= diceRoll;

					} else if ((player1 += diceRoll) == ladder) {
						player1 += diceRoll;
					}
					
				
				}
			}

		}
	}
}
