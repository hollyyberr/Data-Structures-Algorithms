package change;

import java.text.NumberFormat;
import java.util.Scanner;

public class MakeChange {

	//create and initialize local variables
	double paid;
	double total;
	double change;
	static NumberFormat format = NumberFormat.getCurrencyInstance();
	//constructor
	public MakeChange() {
		paid = 0;
		total = 0;
	}
	//method to record purchase
	public void recordPurchase(double sale) {
		total += sale;
	}
	//method to record payment
	public void receivePayment(double paymentAmount) {
		paid += paymentAmount;
	}

	//method to give change
	public double giveChange() {
		change = paid - total;
		return change;
	}

	//main method
	public static void main(String[] args) {
		//create a make change object
		MakeChange register1 = new MakeChange();
		Scanner scan = new Scanner(System.in);
	
		//create the array of bills and other local variables
		double [] bills = {100, 50, 20, 10, 5, 1, .25, .10, .05, .01};
		int [] array = new int [bills.length]; 
		int count = 0;
		int zero = 0;
		double hundred = 100.0;
		int change;

		//user input for purchase
		System.out.print("Purchase price: ");
		Scanner in = new Scanner(System.in);
		double purchase = in.nextDouble();
		register1.recordPurchase(purchase);
		//user input for paid amount
		System.out.print("Payment: ");
		double payment = in.nextDouble();
		register1.receivePayment(payment);

		double changeNeeded = payment - purchase;
		register1.giveChange();

		while(changeNeeded != zero) 
		{
			//for loop to insert into the array
			for(int i = zero; i < bills.length; i++)
			{   
				if(changeNeeded >= bills[i])
				{
					count = (int) (changeNeeded / bills[i]); 
					array[i] = count;
					changeNeeded -= bills[i] * count; 
					changeNeeded = Math.round(changeNeeded * hundred) / hundred; 
				}
			}  
		}
		//Output the change needed to the user
		System.out.println("Change made: ");
		for(int i = zero; i < bills.length; i++)
		{  
			System.out.println("Number of bills: " + array[i] + " Type of bill: " + format.format(bills[i]));  
		}  	
	}
}
