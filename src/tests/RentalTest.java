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
		movie = new Movie("Titel", 20);
		rental = new Rental(movie, 5);
	}

	@Test
	public void getDaysRented() {
		assertEquals(5, rental.getDaysRented());
	}

	@Test
	public void getMovie() {
		assertEquals(movie, rental.getMovie());
	}

}
