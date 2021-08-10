package com.useCases;

import java.util.Random;

public class SnakeAndLadder {

	public static void main(String[] args) {
		int player1=0;
		//System.out.println(player1);
		Random r=new Random();
		
       
        while(player1!=100&&player1<100) { 
        	
        	 int diceRoll=r.nextInt(7);
             //System.out.println(diceRoll);
        	 if(diceRoll==0)           
             {
                diceRoll++;
             }
        	 
        	
           player1=player1+diceRoll;
           System.out.println("player1   " +player1);
             if(player1<0) {
        		 
              	player1=0;	
              	
              	}else if(player1==100) {
              		break;
              	}
             
        int snake=r.nextInt(100);
        int ladder=r.nextInt(100);

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
	

}
	

