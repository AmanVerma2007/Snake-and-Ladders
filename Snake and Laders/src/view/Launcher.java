package view;

import java.util.Scanner;

import Runner.Gamerunner;

public class Launcher {
	public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	int curser=0;

	Gamerunner a = new Gamerunner();
	
	
	while(curser!=3){
		
		System.out.println("-->1. Start Game");
		System.out.println("-->2. Credits");
		System.out.println("-->3. Exit Game");
		curser=obj.nextInt();
		if(curser==1) { 
			//clear screen............................................................
			System.out.println("Enter the number of players");
			int player_count=obj.nextInt();
			a.game(player_count);}
		if(curser==2) { 
			//clear screen............................................................
			showcredits();
		}
		
	}
	
	System.out.println("Thanks for playing Snake And Ladders ");
	System.out.println("\n Run Program again to play Game ");
	obj.close();
	}
	//..............put somewhere else..............................................
static void showcredits() {}

}