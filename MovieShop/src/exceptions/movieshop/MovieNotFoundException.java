package exceptions.movieshop;

public class MovieNotFoundException extends Exception {
	public MovieNotFoundException (String message) {
		super(message);
	}
}