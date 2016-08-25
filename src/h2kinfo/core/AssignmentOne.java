package h2kinfo.core;

public class AssignmentOne {

	public static void main(String[] args) {

		float mealCost = 12.00f;
		float tipPercent = 20;
		float taxPercent = 8;
		float tip;
		float tax;
		float totalCost;

		tip = mealCost * (tipPercent/100);
		tax = mealCost * (taxPercent/100);
		totalCost = mealCost + tip + tax;

		System.out.println("The total meal cost is " + Math.round(totalCost) + " dollars.");

	}

}
