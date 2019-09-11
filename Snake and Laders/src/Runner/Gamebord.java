package Runner;

public class Gamebord {

	int[] gpad=new int[100];	
	
Gamebord(){
	for(int i=0;i<100;i++) { gpad[i]=i+1;  }
}
int snake_ladder(int k)
{//..........................ladders
	if(k==1) {System.out.print("\n\t\t\tHidden Stairs at "+k+" to "+38);		return 38;}
	if(k==4) {System.out.print("\n\t\t\tHidden Stairs at "+k+" to "+14);		return 14;}
	if(k==9) {System.out.print("\n\t\t\tHidden Stairs at "+k+" to "+31);		return 31;}
	if(k==21) {System.out.print("\n\t\t\tHidden Stairs at "+k+" to "+42);		return 42;}
	if(k==28) {System.out.print("\n\t\t\tHidden Stairs at "+k+" to "+84);		return 84;}
	if(k==51) {System.out.print("\n\t\t\tHidden Stairs at "+k+" to "+67);		return 67;}
	if(k==72) {System.out.print("\n\t\t\tHidden Stairs at "+k+" to "+91);		return 91;}
	if(k==80) {System.out.print("\n\t\t\tHidden Stairs at "+k+" to "+99);		return 99;}
//..........................snakes
	if(k==98) {System.out.print("\n\t\t\tSnake attack at "+k+" go to "+79);		return 79;}
	if(k==95) {System.out.print("\n\t\t\tSnake attack at "+k+" go to "+75);		return 75;}
	if(k==93) {System.out.print("\n\t\t\tSnake attack at "+k+" go to "+73);		return 73;}
	if(k==87) {System.out.print("\n\t\t\tSnake attack at "+k+" go to "+24);		return 24;}
	if(k==64) {System.out.print("\n\t\t\tSnake attack at "+k+" go to "+60);		return 60;}
	if(k==62) {System.out.print("\n\t\t\tSnake attack at "+k+" go to "+19);		return 19;}
	if(k==54) {System.out.print("\n\t\t\tSnake attack at "+k+" go to "+34);		return 34;}
	if(k==17) {System.out.print("\n\t\t\tSnake attack at "+k+" go to "+7);		return 7;}
//.........................return same if not above
	else {return k;}
}


int move(int a[], int no,int value ,int check_1[]) {
	
	if(check_1[no]==1 && value<6) {           
		System.out.println("\n\t\t\t Go get a six to start");
		return 0;
	}
	
	if(check_1[no]==1 && value==6) {	check_1[no]++; return 0;}
	
	if(100-a[no] <value && value!=6){ 
		System.out.println("\n\t\t\t You need value less then "+value+" to reach 100");
		return a[no];		
	}
	if(100-a[no] <value && value==6){ 
		System.out.println("\n\t\t\t Try your luck again ");
		return a[no];		
	}	
	
	
	//..........................................roll..steps........................
	check_1[no]++;
	a[no]=a[no]+value;	
	a[no]=snake_ladder(a[no]);
	
	
return a[no];
}
	
	


	
}
