package movieshop;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import exceptions.movieshop.ClientNotFoundException;
import exceptions.movieshop.InvalidCharactersException;
import exceptions.movieshop.InvalidMovieYearException;
import exceptions.movieshop.MovieNotFoundException;
import exceptions.movieshop.NegativePriceException;

public final class MovieShop {

	static final String SHOP_NAME = "Cinema Central";


	
	static String shopName(String shopname) {
		return "Welcome to: " + shopname;
	}
	
	static {
		System.out.println("Shop opened! " +shopName(SHOP_NAME));
	}
	
	
	public static final void main(String[] args) throws InvalidMovieYearException, NegativePriceException, MovieNotFoundException {
		
		
		
		
		Client client = new Client("Adam", "Smith", "1990-01-01", 'M');
		System.out.println("Welcome " + client.getFirstName());

		//handling exception using throws
		Movie movie = new Movie("Spider-man 3", "Action/SF", "Sam Raimi" , 1889, 139);
		System.out.println("Movie chosen: " + movie.getTitle());
	
		//handling exception using throws
		BuyMovie buyMovie = new BuyMovie(client, movie, 150.0, 15.2, "021-B", "21-07-2014");
		buyMovie.processTranscation();
		System.out.printf("Bought from the client %s %s for the price of %.2f\n", buyMovie.getClient(), buyMovie.getMovie(), buyMovie.getPrice());
		
		
		//Movie movie2 = null;
		
		//handling exception using throws
		RateMovie rateMovie = new RateMovie(movie, 8.5);
		System.out.printf("\nRating for a %s movie: %.2f", rateMovie.getMovie(), rateMovie.getRating());
		
		Client client2 = null;
		
		//Handling exception using try-catch
		try {
		ClientStats clientStats = new ClientStats(client2, 150.0, 1, 0);
		System.out.printf("\nClient %s has spent %.2f, bought %d, rented %d movies", 
				clientStats.getClient(), 
				clientStats.getMoneySpent(), 
				clientStats.getMoviesBought(),
				clientStats.getMoviesRented());
		
		ContactForm contactForm = new ContactForm(client2, "test messagąśąśe");
		client.setLastName("Brown"); //Setting new last name
		System.out.printf("\nAdam Smith's new name last name: %s", client.getLastName());
		System.out.printf("\nClient %s message: %s", contactForm.getClient(), contactForm.getMessage());

		} catch (ClientNotFoundException e) {
			 try (BufferedWriter writer = new BufferedWriter(new FileWriter("error.log", true))) {
			        writer.write("Client not found: " + e.getMessage());
			        writer.newLine();
			    } catch (IOException ioException) {
			        System.err.println("Failed to write to log file: " + ioException.getMessage());
			    }
		} catch (InvalidCharactersException e) {
			System.err.println("Invalid characters");
			
			 try (BufferedWriter writer = new BufferedWriter(new FileWriter("error.log", true))) {
			        writer.write("Invalid characters: " + e.getMessage());
			        writer.newLine();
			    } catch (IOException ioException) {
			        System.err.println("Failed to write to log file: " + ioException.getMessage());
			    }
			
		}
		
		
	
//		
//
//		Inventory inventory = new Inventory(movie);
//		System.out.println("\nMovie in shop's inventory: " + inventory.getMovie());
//		
//		Membership membership = new Membership(client, true);
//		System.out.printf("User: %s Membership status: %s", membership.getClient(), membership.isMember());
//		
//		MovieReviews movieReviews = new MovieReviews(movie, "Great movie 10/10");
//		System.out.printf("\nReview for %s: %s", movieReviews.getMovie(), movieReviews.getReview());
//		
//		MovieStats movieStats = new MovieStats(movie, 894_900_000, false);
//		System.out.printf("\nStats for %s - Box office: %.2f - Oscar award: %s", movieStats.getMovie(), movieStats.getBoxOffice(), movieStats.getHasOscars());
//		
//		MovieStatus movieStatus = new MovieStatus(movie, true);
//		System.out.printf("\nMovie: %s availability: %s ", movieStatus.getMovie(), movieStatus.getIsAvailable());
//		
//		Discount discount = new Discount(movie, 0.20);
//		int percentageValue = (int) (discount.getPromoValue() * 100);
//		
//		System.out.printf("\nMovie %s has been discounted for %d percent!", discount.getMovie(), percentageValue);
//	
//		
//		RentMovie rentMovie = new RentMovie(client, movie, 23.1, "004-R", "25-06-2021", "27-06-2021", "30-06-2021", 5);
//		rentMovie.processTranscation();
//
//		System.out.printf("%s has rented %s. Start: %s End: %s Day Price: %.2f\n", 
//				rentMovie.getClient(), 
//				rentMovie.getMovie(), 
//				rentMovie.getStartRentDate(), 
//				rentMovie.getEndRentDate(), 
//				rentMovie.getDayPrice());
		
				//Calling inherited abstract method from an abstract class
//		
//		
//		Report report = new Report("The tap is leaking in the kitchen");
//		System.out.printf("\nReport message: %s", report.getReportMessage());
//		
//		SellMovie sellMovie = new SellMovie(client, movie, 15.99, "2021-02-01", 19.7, "003-S");
//		sellMovie.processTranscation();
//
//		System.out.printf("Movie %s sold to a client %s for %.2f Transaction date: %s\n", 
//				sellMovie.getMovie(), 
//				sellMovie.getClient(), 
//				sellMovie.getPrice(), 
//				sellMovie.getTransactionDate());
//		
//		
//		ReturnMovie returnMovie = new ReturnMovie(movie, "2019-02-01");
//		System.out.printf("\nMovie %s return date: %s ", returnMovie.getMovie(), returnMovie.getReturnDate());
//		
//		ShopReviews shopReviews = new ShopReviews("A test review");
//		System.out.printf("\nNew shop review: %s", shopReviews.getReview());
//		
//		ShopStats shopStats = new ShopStats(122, 250);
//		System.out.printf("\nShop stats: Movies available - %d Clients total - %d\n", shopStats.getMoviesAvailable(), shopStats.getNumOfCustomers());
//		
//		ShopStatus shopStatus = new ShopStatus(false);
//		System.out.println(shopStatus.shopStatusCheck(shopStatus.isClosed()));
//		
//		Staff staff = new Staff("Robert", "White", "1989-06-12", "Client Support", 'M');
//		System.out.printf("Staff member details: %s %s %s %s %s ", 
//				staff.getFirstName(), 
//				staff.getLastName(), 
//				staff.getBirthDate(), 
//				staff.getPosition(), 
//				staff.getGender());

		
	}
	
}

