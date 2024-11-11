package movieshop;

public class ReturnMovie {

	private Movie movie;
	private String returnDate;
	
	public ReturnMovie(Movie movie, String returnDate) {
		this.movie = movie;
		this.returnDate = returnDate;
	}
	
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	
	
	
	
}
