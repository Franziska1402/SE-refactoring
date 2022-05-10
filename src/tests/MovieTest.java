package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import classes.Movie;

class MovieTest {

	private Movie movie;

	@BeforeEach
	public void beforeEach() {
		movie = new Movie("Film", 15);
	}

	@Test
	public void getPriceCode() {
		assertEquals(15, movie.getPriceCode());
	}

	@Test
	public void setPriceCode() {
		movie.setPriceCode(10);
		assertEquals(movie.getPriceCode(), 10);
	}

	@Test
	public void getTitle() {
		assertEquals("Film", movie.getTitle());
	}
}
