package classes;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private List<Rental> rentals = new ArrayList<>();

	public Customer(String newname) {
		name = newname;
	}

	public void addRental(Rental rental) {
		rentals.add(rental);
	}

	public String getName() {
		return name;
	}

	public String statement() {
		StringBuilder result = new StringBuilder("Rental Record for " + this.getName() + "\n");
		result.append("\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n");

		for (Rental rental : rentals) {
			result.append(rental.toString());
		}

		result.append("Amount owed is " + getTotalCharge() + "\n");
		result.append("You earned " + getTotalFrequentRenterPoints() + " frequent renter points");
		return result.toString();
	}

	private double getTotalCharge() {
		double charge = 0;
		for (Rental rental : rentals) {
			charge += rental.getCharge();
		}
		return charge;
	}

	private int getTotalFrequentRenterPoints() {
		int points = 0;
		for (Rental rental : rentals) {
			points += rental.getFrequentRenterPoints();
		}
		return points;
	}
}