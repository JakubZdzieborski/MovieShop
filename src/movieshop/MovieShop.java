package movieshop;
 
import wordscounter.UniqueWordsCount;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.*;

import customlambda.movieshop.ListCounter;
import customlambda.movieshop.ListParameterCounter;
import customlambda.movieshop.GenericCheck;

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
		
		
		
		
//		Client client = new Client("Adam", "Smith", "1990-01-01", 'M');
//		System.out.println("Welcome " + client.getFirstName());
//
//		//handling exception using throws
//		Movie movie = new Movie("Spider-man 3", "Action/SF", "Sam Raimi" , 1889, 139);
//		System.out.println("Movie chosen: " + movie.getTitle());
//	
//		//handling exception using throws
//		BuyMovie buyMovie = new BuyMovie(client, movie, 150.0, 15.2, "021-B", "21-07-2014");
//		buyMovie.processTranscation();
//		System.out.printf("Bought from the client %s %s for the price of %.2f\n", buyMovie.getClient(), buyMovie.getMovie(), buyMovie.getPrice());
//		
//		
//		//Movie movie2 = null;
//		
//		//handling exception using throws
//		RateMovie rateMovie = new RateMovie(movie, 8.5);
//		System.out.printf("\nRating for a %s movie: %.2f", rateMovie.getMovie(), rateMovie.getRating());
//		Client client2 = null;
//		
//		//Handling exception using try-catch
//		try {
//		ClientStats clientStats = new ClientStats(client2, 150.0, 1, 0);
//		System.out.printf("\nClient %s has spent %.2f, bought %d, rented %d movies", 
//				clientStats.getClient(), 
//				clientStats.getMoneySpent(), 
//				clientStats.getMoviesBought(),
//				clientStats.getMoviesRented());
//		
//		ContactForm contactForm = new ContactForm(client2, "test messagąśąśe");
//		client.setLastName("Brown"); //Setting new last name
//		System.out.printf("\nAdam Smith's new name last name: %s", client.getLastName());
//		System.out.printf("\nClient %s message: %s", contactForm.getClient(), contactForm.getMessage());
//
//		} catch (ClientNotFoundException e) {
//			 try (BufferedWriter writer = new BufferedWriter(new FileWriter("error.log", true))) {
//			        writer.write("Client not found: " + e.getMessage());
//			        writer.newLine();
//			    } catch (IOException ioException) {
//			        System.err.println("Failed to write to log file: " + ioException.getMessage());
//			    }
//		} catch (InvalidCharactersException e) {
//			System.err.println("Invalid characters");
//			
//			 try (BufferedWriter writer = new BufferedWriter(new FileWriter("error.log", true))) {
//			        writer.write("Invalid characters: " + e.getMessage());
//			        writer.newLine();
//			    } catch (IOException ioException) {
//			        System.err.println("Failed to write to log file: " + ioException.getMessage());
//			    }
//			
//		}
//		
//		
//	
//		
//
//		Inventory inventory = new Inventory(movie);
//		System.out.println("\nMovie in shop's inventory: " + inventory.getMovie());
//		
////		Membership membership = new Membership(client, true);
////		System.out.printf("User: %s Membership status: %s", membership.getClient(), membership.isMember());
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
//		
//				//Calling inherited abstract method from an abstract class
//		
//		
//		Report report = new Report("The tap is leaking in the kitchen");
//		System.out.printf("\nReport message: %s", report.getReportMessage());
//	
//	SellMovie sellMovie = new SellMovie(client, movie, 15.99, "2021-02-01", 19.7, "003-S");
//	sellMovie.processTranscation();
//
//	System.out.printf("Movie %s sold to a client %s for %.2f Transaction date: %s\n", 
//			sellMovie.getMovie(), 
//			sellMovie.getClient(), 
//			sellMovie.getPrice(), 
//			sellMovie.getTransactionDate());
//	
//	
//	ReturnMovie returnMovie = new ReturnMovie(movie, "2019-02-01");
//	System.out.printf("\nMovie %s return date: %s ", returnMovie.getMovie(), returnMovie.getReturnDate());
//	
//	ShopReviews shopReviews = new ShopReviews("A test review");
//	System.out.printf("\nNew shop review: %s", shopReviews.getReview());
//	
//	ShopStats shopStats = new ShopStats(122, 250);
//	System.out.printf("\nShop stats: Movies available - %d Clients total - %d\n", shopStats.getMoviesAvailable(), shopStats.getNumOfCustomers());
//	
//	ShopStatus shopStatus = new ShopStatus(false);
//	System.out.println(shopStatus.shopStatusCheck(shopStatus.isClosed()));
//	
//	Staff staff = new Staff("Robert", "White", "1989-06-12", "Client Support", 'M');
//	System.out.printf("Staff member details: %s %s %s %s %s ", 
//			staff.getFirstName(), 
//			staff.getLastName(), 
//			staff.getBirthDate(), 
//			staff.getPosition(), 
//			staff.getGender());

		
//System.out.println("------------------------------------- Homework 6 -------------------------------------");	


Client client = new Client("John", "Smith", "1999-01-01", 'M');
Client client2 = new Client("Adam", "Robert", "2010-01-01", 'F');
Client client3 = new Client("Isaiah", "Devin", "1999-01-01", 'M');

//Predicate - return true if client is female
Predicate<Client> isClientFemale = g -> g.getGender() == 'F';
System.out.println("Is client Female? - " + isClientFemale.test(client2));

Function<Client, String> clientFullName = cfn -> cfn.getFirstName() + " " + cfn.getLastName();
System.out.println("Full name of a client: " + clientFullName.apply(client2));

Consumer<Client> clientBirthDate = cbd -> System.out.println("Client birthdate: " + cbd.getBirthDate());
clientBirthDate.accept(client2);

Supplier<String> shopName = () -> SHOP_NAME;
System.out.println("Shop name: " +  shopName.get());

UnaryOperator<Client> changeLastName = cln -> {
	cln.setLastName("Brown");
	return cln;
};

GenericCheck<String, Boolean> gc = (dob) -> {
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate birthDate = LocalDate.parse((CharSequence) dob, formatter);
    LocalDate currentDate = LocalDate.now();
    int age = Period.between(birthDate, currentDate).getYears();
    return age >= 18;
    
	
};

boolean result = gc.apply(client2.getBirthDate());
System.out.println(result);


System.out.println("Old last name: " + client2.getLastName());
changeLastName.apply(client2);
System.out.println("New last name: " + client2.getLastName());

Movie movie = new Movie("Spider-man 3", "Action/SF", "Sam Raimi" , 1889, 139);

BuyMovie buyTransaction = new BuyMovie(client, movie, 19.99, 2.5, "TXN001", "2024-12-05");
RentMovie rentTransaction = new RentMovie(client, movie, 1.5, "TXN002", "2024-12-05", "2024-12-06", "2024-12-10", 3.99);
SellMovie sellTransaction = new SellMovie(client, movie, 10.00, "2024-12-05", 1.5, "TXN003");

Cart<Transaction> cart = new Cart<>();

cart.add(buyTransaction);
cart.add(rentTransaction);
cart.add(sellTransaction);
		

//System.out.println("Cart contents:");
//cart.printList();

// Process all transactions
//System.out.println("\nProcessing all transactions:");
//cart.processAllTransactions();


List<Staff> staffList = new ArrayList<>();
staffList.add(new Staff("John", "Smith", "1985-03-22", "Manual Tester", 'M'));
staffList.add(new Staff("Agatha", "Smokes", "1990-06-15", "Customer Support", 'F'));
staffList.add(new Staff("Robert", "Brown", "1991-06-15", "Customer Support", 'M'));

ListCounter<Staff> lc = (list) -> list.size();

int staffCount = lc.count(staffList);

System.out.println(staffCount);

ListParameterCounter <Staff, String> lpc = (list, role) ->  {
	
	 int count = 0;
     for (Staff staff : list) {
         if (staff.getPosition().equalsIgnoreCase(role)) {
             count++;
         }
     }
     return count;
};

int customerSupportStaff = lpc.countByParameter(staffList, "Customer Support");
System.out.println(customerSupportStaff);

StaffDepartment staffDepartment = new StaffDepartment();

staffDepartment.assignDepartment("Online sales", staffList.get(0));
staffDepartment.assignDepartment("Online sales", staffList.get(1));
staffDepartment.assignDepartment("Customer service", staffList.get(2));


//System.out.println(staffDepartment.getStaffDepartment(staffList.get(2)));

//staffDepartment.displayDepartments();


StaffGenderSet genderStaff = new StaffGenderSet();

genderStaff.addStaff(staffList);
//
//System.out.println("Male Staff: " + genderStaff.returnMaleStaff());
//System.out.println("Female Staff: " + genderStaff.returnFemaleStaff());



List<Membership> membershipList = new ArrayList<>();
membershipList.add(new Membership(client));
membershipList.add(new Membership(client2));
membershipList.add(new Membership(client3));


//for (Membership membership : membershipList) {
//	System.out.println(membership.getClient());
//}


		
		UniqueWordsCount uniqueWordsCount = new UniqueWordsCount("inputFile.txt", "outputFile.txt");
		
		
		//System.out.println(uniqueWordsCount.getInputFile());
		//System.out.println(uniqueWordsCount.getOutputFile());

		
		
		try {
		uniqueWordsCount.processFiles();
		} catch (IOException e){
			

			e.printStackTrace();
		}
		

	}
	
}

