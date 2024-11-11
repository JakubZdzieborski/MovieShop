package movieshop;

public class Discount {

	private Movie movie;
	private double discountValue;
	
	public Discount(Movie movie, double discountValue) {
		
		this.movie = movie;
		this.discountValue = discountValue;
	}
	
	public Movie getMovie() {
		return movie;
	}
	
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	public double getPromoValue() {
		return discountValue;
	}
	
	public void setPromoValue(double promoValue) {
		this.discountValue = promoValue;
	}
	
	
	
}

