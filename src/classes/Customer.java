package classes;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
	private String name;
	private Vector<Rental> rentals = new Vector<>();

	public Customer(String newname) {
		name = newname;
	}

	public void addRental(Rental arg) {
		rentals.addElement(arg);
	}

	public String getName() {
		return name;
	}

	public String statement() {
		Enumeration<Rental> enumRentals = rentals.elements();
		StringBuilder result = new StringBuilder("Rental Record for " + this.getName() + "\n");
		result.append("\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n");

		while (enumRentals.hasMoreElements()) {
			Rental each = enumRentals.nextElement();
			// show figures for this rental
			result.append("\t" + each.getMovie().getTitle() + "\t" + "\t" + each.getDaysRented() + "\t"
					+ String.valueOf(each.getCharge()) + "\n");
		}
		// add footer lines
		result.append("Amount owed is " + String.valueOf(getTotalCharge()) + "\n");
		result.append("You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points");
		return result.toString();
	}

	private int getTotalFrequentRenterPoints() {
		int result = 0;
		Enumeration<Rental> enumRentals = rentals.elements();
		while (enumRentals.hasMoreElements()) {
			Rental each = enumRentals.nextElement();
			result += each.getFrequentRenterPoints();
		}
		return result;
	}

	private double getTotalCharge() {
		double result = 0;
		Enumeration<Rental> enumRentals = rentals.elements();
		while (enumRentals.hasMoreElements()) {
			Rental each = enumRentals.nextElement();
			result += each.getCharge();
		}
		return result;
	}
}
