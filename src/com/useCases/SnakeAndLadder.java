package com.useCases;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class SnakeAndLadder {

	public static void main(String[] args) {
		int player1=0;
		Random r=new Random();
        int diceRoll=r.nextInt(7);
        System.out.println(diceRoll);
	
        player1+=diceRoll;
        int snake=r.nextInt(50);
        int ladder=r.nextInt(50);
        
        System.out.println(snake);
        System.out.println(ladder);
        if(player1==snake) {
        	player1-=diceRoll;
        	
        }else if(player1==ladder) {
        	player1+=diceRoll;
        }
        
        System.out.println(player1);
	}
}
