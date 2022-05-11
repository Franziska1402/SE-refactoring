package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import classes.Movie;

class MovieTest {

	private Movie movie;

	@BeforeEach
	public void beforeEach() {
		movie = new Movie("Film", Movie.CHILDRENS);
	}

	@Test
	public void getPriceCode() {
		assertEquals(2, movie.getPriceCode());
	}

	@Test
	public void setPriceCode() {
		movie.setPriceCode(Movie.NEW_RELEASE);
		assertEquals(movie.getPriceCode(), 1);
	}

	@Test
	public void getTitle() {
		assertEquals("Film", movie.getTitle());
	}
}
