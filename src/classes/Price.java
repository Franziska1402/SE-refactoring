package classes;

public abstract class Price {
	static final int DAYS_RENTED = 1;

	public abstract int getPriceCode();

	public abstract double getCharge(int daysRented);

	protected int getFrequentRenterPoints(int daysRented) {
		return DAYS_RENTED;
	}
}
