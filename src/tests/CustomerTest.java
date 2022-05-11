package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import classes.Customer;
import classes.Movie;
import classes.Rental;

class CustomerTest {

	private Customer customer;
	private List<Rental> rentals;

	@BeforeEach
	public void beforeEach() {
		customer = new Customer("Adam");
		rentals = new ArrayList<>();
	}

	@Test
	public void getName() {
		assertEquals("Adam", this.customer.getName());
	}

	@Test
	public void statement() {
		String statementExp = "Rental Record for " + customer.getName() + "\n";
		statementExp += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";
		statementExp += "Amount owed is " + "0.0" + "\n";
		statementExp += "You earned " + "0" + " frequent renter points";

		assertEquals(statementExp, customer.statement());
	}

	@Test
	public void addRental() {
		int i = rentals.size();

		rentals.add(new Rental(new Movie("TITLE", Movie.REGULAR), 0));
		assertEquals(i + 1, rentals.size());
	}
}
