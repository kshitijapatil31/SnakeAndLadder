package com.useCases;

import java.util.Random;

public class SnakeAndLadder {

	public static void main(String[] args) {
		int player1=0;
		Random r=new Random();
        int diceRoll=r.nextInt(7);
        System.out.println(diceRoll);
	}

}
