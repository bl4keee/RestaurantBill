import java.util.Scanner;
public class RestaurantBill {

	//constants
	private static final double TAX_RATE = 0.05; //5%
	private static final double TIP_PERCENT = 0.15; //15%
	
	public static void main(String[] args) {
	
		//variables 
		double mealPrice, tax, tip, total;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter meal price: ");
		mealPrice = scanner.nextDouble();
		scanner.close();
		tax = getTax(mealPrice);
		tip = getTip(mealPrice);
		total = getTotal(mealPrice, tax, tip);
		
		
		displayBill(mealPrice, tax, tip, total);

	}
	static double getTax(double mealPrice) {
		return mealPrice * TAX_RATE;
	}
	static double getTip(double mealPrice) {
		return mealPrice * TIP_PERCENT;
	}
	static double getTotal(double mealPrice, double tax, double tip) {
		return mealPrice + tax + tip;
	}
	static void displayBill(double mealPrice, double tax, double tip, double total) {
		System.out.println("THE BILL: ");
		System.out.println("BASE MEAL PRICE ............... $" + mealPrice);
		System.out.println("TAX AMOUNT .................... $" + tax);
		System.out.println("TIP AMOUNT .................... $" + tip);
		System.out.println("");
		System.out.println("TOTAL BILL .................... $" + total);
	}

}
