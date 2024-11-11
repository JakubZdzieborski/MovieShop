package movieshop;

public class MovieStats {

	private Movie movie;
	private double boxOffice;
	private boolean hasOscars;
	
	public MovieStats(Movie movie, double boxOffice, boolean hasOscars) {
		
		this.movie = movie;
		this.boxOffice = boxOffice;
		this.hasOscars = hasOscars;
	}
	
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public double getBoxOffice() {
		return boxOffice;
	}
	public void setBoxOffice(double boxOffice) {
		this.boxOffice = boxOffice;
	}
	
	public boolean getHasOscars() {
		return hasOscars;
	}
	public void setHasOscars(boolean hasOscars) {
		this.hasOscars = hasOscars;
	}
	
	
	
}
