package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import classes.Movie;
import classes.Rental;

class RentalTest {

	private Rental rental;
	private Movie movie;

	@BeforeEach
	public void beforeEach() {
		movie = new Movie("Titel", Movie.REGULAR);
		rental = new Rental(movie, 10);
	}

	@Test
	public void getDaysRented() {
		assertEquals(10, rental.getDaysRented());
	}

	@Test
	public void getMovie() {
		assertEquals(movie, rental.getMovie());
	}

	@Test
	public void getFrequentRenterPoints() {
		assertEquals(1, rental.getFrequentRenterPoints());
	}

	@Test
	public void getCharge() {
		assertEquals(14.0, rental.getCharge(), 0);
	}
}
