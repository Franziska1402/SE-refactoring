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
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		Enumeration<Rental> enumRentals = rentals.elements();
		StringBuilder result = new StringBuilder("Rental Record for " + this.getName() + "\n");
		result.append("\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n");

		while (enumRentals.hasMoreElements()) {
			Rental each = enumRentals.nextElement();
			// add frequent renter points
			frequentRenterPoints++;
			// add bonus for a two day new release rental
			if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1)
				frequentRenterPoints++;
			// show figures for this rental
			result.append("\t" + each.getMovie().getTitle() + "\t" + "\t" + each.getDaysRented() + "\t"
					+ String.valueOf(each.getCharge()) + "\n");
			totalAmount += each.getCharge();
		}
		// add footer lines
		result.append("Amount owed is " + String.valueOf(totalAmount) + "\n");
		result.append("You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points");
		return result.toString();
	}

}
