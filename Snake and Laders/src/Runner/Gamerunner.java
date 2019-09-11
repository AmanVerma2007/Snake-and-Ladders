package Runner;

import java.util.Random;
import java.util.Scanner;

public class Gamerunner {
	Scanner console = new Scanner(System.in);
	
	int players;
	
public Gamerunner(){ players=0; }

Gamebord a=new Gamebord();

	Random r= new Random();//..............random...........
public int randomno() {
int z=1000;
while(z>6||z<1) {
z=r.nextInt(7);
}
return z;
}

	public void game(int players_count){//..............game fun.....................
	players=players_count;
	
	int[] player= new int[players];
	int[] firstcheck =new int[players];
	for(int i=0;i<players;i++) { player[i]=0; firstcheck[i]=1;}//....arr inetialise =0
	//.......................................................................................
int loop=1;
int i;//......in CASE 1 WINS ADD ITS VALUE
	while( loop>0)//........................................while loop.......
	{
		for(i=0;i<players;i++) //...................................fetch player.................
		{
		int j=i+1;
		System.out.println("\nPlayer "+j+"'s turn: ");
		console.nextLine();
		System.out.print("\t\t\t player "+j+"'s got  :");
		int dicno  =randomno();
		System.out.print(dicno);

		//................................................GOING TO GAMEBORD FOR PLAYER POS				
		if(dicno!=6) {	player[i]=a.move(player,i,dicno,firstcheck);	}

		if(dicno==6) {           

				player[i]=a.move(player,i,dicno,firstcheck);
					System.out.println("\n \t\t\t got 6 roll 2nd time");
					console.nextLine();			dicno=randomno();
					System.out.print("\t\t\t This time you have "+dicno);
					
										
						if(dicno!=6) {	player[i]=a.move(player,i,dicno,firstcheck);	}
						if(dicno==6) {
							player[i]=a.move(player,i,dicno,firstcheck);
							System.out.print("\n\t\t\t  got 6 again roll 3rd time");
							console.nextLine();			dicno=randomno(); 
							System.out.print("\t\t\t This time you have "+dicno);
								
		
								if(dicno!=6) {	player[i]=a.move(player,i,dicno,firstcheck);	}
								if(dicno==6) {dicno=0;
									System.out.println("\n \t\t\t 6 agin you got 0");
								
								}	
						}
				}
				//.....................................triple six done.............

		System.out.print("\n\t\t\t Player "+j+"'s position is "+player[i]+"\n");
		
		if(player[i]>=100)//...................make = 100
		{ 
			System.out.print("\n.......................Player "+j+"Wins...................... \n");			
			loop--;
			break;	
		}
		}//.......................................................player out...............
		
	}//.......LOOP end................................................................................

	
}
}// end
