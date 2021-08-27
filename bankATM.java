/*
 * written by Diana Sen
 * 
 */
public class bankATM {

	public static void main(String[] args) {
		System.out.println("Welcome to ATM\nCurrently this atm only has $100, $50, $20 "
				+ "dollar bills.\n So you will only be able to get money in these "
				+ "increments");
		
		int amount = 260;
		
		int[] money = new int[3];

		int remainder = amount % 100;
		
		money[0] = (remainder == 10 || remainder == 30) && amount >= 100 ? 
				(amount / 100 - 1) : amount / 100;
		amount -= money[0] * 100;
	      	
	      	
	      	//money[1] = amount / 50;
	      	//amount = amount % 50;
	      amount = amount -(money[1] * 50);
	      money[1] = amount % 20 == 0 ? 0 : amount < 50 ? 0 : 1;
	  amount =amount - (money[1] * 50);
	      
	      
	      	money[2] = amount / 20;
	      	amount = amount - (money[2] * 20);
	      
	      	System.out.println("You will get\nHundred dollar bills: " + money[0]);
	      	System.out.println("Fifty dollar bills: " + money[1]);
	      	System.out.println("Twenty dollar bills: " + money[2]);
	}

}
