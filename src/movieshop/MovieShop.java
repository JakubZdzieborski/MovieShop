package movieshop;
 
import wordscounter.UniqueWordsCount;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import java.util.function.*;
import java.util.stream.Collectors;


import customlambda.movieshop.ListCounter;
import customlambda.movieshop.ListParameterCounter;
import customlambda.movieshop.GenericCheck;

import exceptions.movieshop.ClientNotFoundException;
import exceptions.movieshop.InvalidCharactersException;
import exceptions.movieshop.InvalidMovieYearException;
import exceptions.movieshop.MovieNotFoundException;
import exceptions.movieshop.NegativePriceException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public final class MovieShop {

	private static final Logger logger = LogManager.getLogger(MovieShop.class);

	
	static final String SHOP_NAME = "Cinema Central";


	
	static String shopName(String shopname) {
		return "Welcome to: " + shopname;
	}
	
	static {
		logger.info("Shop opened! " +shopName(SHOP_NAME));
	}
	
	
	public static final void main(String[] args) throws InvalidMovieYearException, NegativePriceException, MovieNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException {
		logger.info("testing..");
		
		
//        Client client = new Client("Adam", "Smith", "1990-01-01", 'M');
//        logger.info("Welcome {}", client.getFirstName());
//
//        //Handling exception using throws
//        Movie movie = new Movie("Spider-man 3", "Action/SF", "Sam Raimi", 1889, 139);
//        logger.info("Movie chosen: {}", movie.getTitle());
//
//        //Handling exception using throws
//        BuyMovie buyMovie = new BuyMovie(client, movie, 150.0, 15.2, "021-B", "21-07-2014");
//        buyMovie.processTranscation();
//        logger.info("Bought from the client {} {} for the price of {:.2f}", buyMovie.getClient(), buyMovie.getMovie(), buyMovie.getPrice());
//
//        //Movie rating
//        RateMovie rateMovie = new RateMovie(movie, 8.5);
//        logger.info("Rating for a {} movie: {:.2f}", rateMovie.getMovie(), rateMovie.getRating());
//        
//        Client client2 = null;
//
//        //Handling exception using try-catch
//        try {
//            ClientStats clientStats = new ClientStats(client2, 150.0, 1, 0);
//            logger.info("Client {} has spent {:.2f}, bought {} and rented {} movies", 
//                    clientStats.getClient(), 
//                    clientStats.getMoneySpent(), 
//                    clientStats.getMoviesBought(),
//                    clientStats.getMoviesRented());
//            
//            ContactForm contactForm = new ContactForm(client2, "test message");
//            client.setLastName("Brown"); // Setting new last name
//            logger.info("Adam Smith's new last name: {}", client.getLastName());
//            logger.info("Client {} message: {}", contactForm.getClient(), contactForm.getMessage());
//
//        } catch (ClientNotFoundException e) {
//            try (BufferedWriter writer = new BufferedWriter(new FileWriter("error.log", true))) {
//                writer.write("Client not found: " + e.getMessage());
//                writer.newLine();
//            } catch (IOException ioException) {
//                logger.error("Failed to write to log file: {}", ioException.getMessage());
//            }
//        } catch (InvalidCharactersException e) {
//            logger.error("Invalid characters detected: {}", e.getMessage());
//            try (BufferedWriter writer = new BufferedWriter(new FileWriter("error.log", true))) {
//                writer.write("Invalid characters: " + e.getMessage());
//                writer.newLine();
//            } catch (IOException ioException) {
//                logger.error("Failed to write to log file: {}", ioException.getMessage());
//            }
//        }
//
//        // Movie inventory
//        Inventory inventory = new Inventory(movie);
//        logger.info("Movie in shop's inventory: {}", inventory.getMovie());
//
//        //Membership status
//        Membership membership = new Membership(client, true);
//        logger.info("User: {} Membership status: {}", membership.getClient(), membership.isMember());
//
//        //Movie reviews
//        MovieReviews movieReviews = new MovieReviews(movie, "Great movie 10/10");
//        logger.info("Review for {}: {}", movieReviews.getMovie(), movieReviews.getReview());
//
//        //Movie stats
//        MovieStats movieStats = new MovieStats(movie, 894_900_000, false);
//        logger.info("Stats for {} - Box office: {:.2f} - Oscar award: {}", 
//                movieStats.getMovie(), 
//                movieStats.getBoxOffice(), 
//                movieStats.getHasOscars());
//
//        //Movie availability
//        MovieStatus movieStatus = new MovieStatus(movie, true);
//        logger.info("Movie: {} availability: {}", movieStatus.getMovie(), movieStatus.getIsAvailable());
//
//        //Discount
//        Discount discount = new Discount(movie, 0.20);
//        int percentageValue = (int) (discount.getPromoValue() * 100);
//        logger.info("Movie {} has been discounted for {} percent!", discount.getMovie(), percentageValue);
//
//        //Rent movie transaction
//        RentMovie rentMovie = new RentMovie(client, movie, 23.1, "004-R", "25-06-2021", "27-06-2021", "30-06-2021", 5);
//        rentMovie.processTranscation();
//        logger.info("{} has rented {}. Start: {} End: {} Day Price: {:.2f}", 
//                rentMovie.getClient(), 
//                rentMovie.getMovie(), 
//                rentMovie.getStartRentDate(), 
//                rentMovie.getEndRentDate(), 
//                rentMovie.getDayPrice());
//
//        //Report message
//        Report report = new Report("The tap is leaking in the kitchen");
//        logger.info("Report message: {}", report.getReportMessage());
//
//        //Sell movie transaction
//        SellMovie sellMovie = new SellMovie(client, movie, 15.99, "2021-02-01", 19.7, "003-S");
//        sellMovie.processTranscation();
//        logger.info("Movie {} sold to a client {} for {:.2f} Transaction date: {}", 
//                sellMovie.getMovie(), 
//                sellMovie.getClient(), 
//                sellMovie.getPrice(), 
//                sellMovie.getTransactionDate());
//
//        //Return movie
//        ReturnMovie returnMovie = new ReturnMovie(movie, "2019-02-01");
//        logger.info("Movie {} return date: {}", returnMovie.getMovie(), returnMovie.getReturnDate());
//
//        //Shop reviews
//        ShopReviews shopReviews = new ShopReviews("A test review");
//        logger.info("New shop review: {}", shopReviews.getReview());
//
//        //Shop stats
//        ShopStats shopStats = new ShopStats(122, 250);
//        logger.info("Shop stats: Movies available - {} Clients total - {}", shopStats.getMoviesAvailable(), shopStats.getNumOfCustomers());
//
//        //Shop status
//        ShopStatus shopStatus = new ShopStatus(false);
//        logger.info("Shop status: {}", shopStatus.shopStatusCheck(shopStatus.isClosed()));
//
//        //Staff details
//        Staff staff = new Staff("Robert", "White", "1989-06-12", "Client Support", 'M');
//        logger.info("Staff member details: {} {} {} {} {}", 
//                staff.getFirstName(), 
//                staff.getLastName(), 
//                staff.getBirthDate(), 
//                staff.getPosition(), 
//                staff.getGender());


//        //Client and other initializations
//        Client client = new Client("John", "Smith", "1999-01-01", 'M');
//        Client client2 = new Client("Adam", "Robert", "2010-01-01", 'F');
//        Client client3 = new Client("Isaiah", "Devin", "1999-01-01", 'M');
//
//        // Predicate - return true if client is female
//        Predicate<Client> isClientFemale = g -> g.getGender() == 'F';
//        logger.info("Is client Female? - {}", isClientFemale.test(client2));
//
//        // Function to get full name of client
//        Function<Client, String> clientFullName = cfn -> cfn.getFirstName() + " " + cfn.getLastName();
//        logger.info("Full name of a client: {}", clientFullName.apply(client2));
//
//        // Consumer to print client birthdate
//        Consumer<Client> clientBirthDate = cbd -> logger.info("Client birthdate: {}", cbd.getBirthDate());
//        clientBirthDate.accept(client2);
//
//        // Supplier to get shop name
//        Supplier<String> shopName = () -> "MOVIE_STORE";
//        logger.info("Shop name: {}", shopName.get());
//
//        // UnaryOperator to change last name
//        UnaryOperator<Client> changeLastName = cln -> {
//            cln.setLastName("Brown");
//            return cln;
//        };
//
//        // GenericCheck for age verification
//        GenericCheck<String, Boolean> gc = (dob) -> {
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//            LocalDate birthDate = LocalDate.parse((CharSequence) dob, formatter);
//            LocalDate currentDate = LocalDate.now();
//            int age = Period.between(birthDate, currentDate).getYears();
//            return age >= 18;
//        };
//
//        boolean result = gc.apply(client2.getBirthDate());
//        logger.info("Client is 18 or older: {}", result);
//
//        // Change last name and log it
//        logger.info("Old last name: {}", client2.getLastName());
//        changeLastName.apply(client2);
//        logger.info("New last name: {}", client2.getLastName());
//
//        // Movie creation and transaction examples
//        Movie movie = new Movie("Spider-man 3", "Action/SF", "Sam Raimi", 1889, 139);
//
//        BuyMovie buyTransaction = new BuyMovie(client, movie, 19.99, 2.5, "TXN001", "2024-12-05");
//        RentMovie rentTransaction = new RentMovie(client, movie, 1.5, "TXN002", "2024-12-05", "2024-12-06", "2024-12-10", 3.99);
//        SellMovie sellTransaction = new SellMovie(client, movie, 10.00, "2024-12-05", 1.5, "TXN003");
//
//        Cart<Transaction> cart = new Cart<>();
//        cart.add(buyTransaction);
//        cart.add(rentTransaction);
//        cart.add(sellTransaction);
//
//        // Process all transactions
//        logger.info("Processing all transactions:");
//        cart.processAllTransactions();
//
//        // Staff list example
//        List<Staff> staffList = new ArrayList<>();
//        staffList.add(new Staff("John", "Smith", "1985-03-22", "Manual Tester", 'M'));
//        staffList.add(new Staff("Agatha", "Smokes", "1990-06-15", "Customer Support", 'F'));
//        staffList.add(new Staff("Robert", "Brown", "1991-06-15", "Customer Support", 'M'));
//
//        ListCounter<Staff> lc = (list) -> list.size();
//        int staffCount = lc.count(staffList);
//        logger.info("Staff count: {}", staffCount);
//
//        // Count by position (role)
//        ListParameterCounter<Staff, String> lpc = (list, role) -> {
//            int count = 0;
//            for (Staff staff : list) {
//                if (staff.getPosition().equalsIgnoreCase(role)) {
//                    count++;
//                }
//            }
//            return count;
//        };
//
//        int customerSupportStaff = lpc.countByParameter(staffList, "Customer Support");
//        logger.info("Customer Support staff count: {}", customerSupportStaff);
//
//        // Staff departments
//        StaffDepartment staffDepartment = new StaffDepartment();
//        staffDepartment.assignDepartment("Online sales", staffList.get(0));
//        staffDepartment.assignDepartment("Online sales", staffList.get(1));
//        staffDepartment.assignDepartment("Customer service", staffList.get(2));
//
//        // Staff gender set handling
//        StaffGenderSet genderStaff = new StaffGenderSet();
//        genderStaff.addStaff(staffList);
//        logger.info("Male Staff: {}", genderStaff.returnMaleStaff());
//        logger.info("Female Staff: {}", genderStaff.returnFemaleStaff());
//
//        // Membership list and logging
//        List<Membership> membershipList = new ArrayList<>();
//        membershipList.add(new Membership(client));
//        membershipList.add(new Membership(client2));
//        membershipList.add(new Membership(client3));
//
//        // Unique word count example
//        UniqueWordsCount uniqueWordsCount = new UniqueWordsCount("inputFile.txt", "outputFile.txt");
//        try {
//            uniqueWordsCount.processFiles();
//        } catch (IOException e) {
//            logger.error("Error processing files: {}", e.getMessage());
//        }
		

        List<Movie> movies = Arrays.asList(
                new Movie("Inception", "Sci-Fi", "Christopher Nolan", 2010, 148),
                new Movie("The Godfather", "Crime", "Francis Ford Coppola", 1972, 175),
                new Movie("Interstellar", "Sci-Fi", "Christopher Nolan", 2014, 169),
                new Movie("The Dark Knight", "Action", "Christopher Nolan", 2008, 152),
                new Movie("Pulp Fiction", "Crime", "Quentin Tarantino", 1994, 154)
            );

            //Non-terminal and terminal streaming operations
        	logger.info("Filtered Movies (Duration > 150 minutes):");
        	movies.stream()
            .filter(movie -> movie.getDuration() > 150)
            .forEach(movie -> logger.info(movie.toString()));

            logger.info("\nGrouped by Genre:");
            Map<String, List<Movie>> moviesByGenre = movies.stream()
                                                            .collect(Collectors.groupingBy(Movie::getGenre));
            moviesByGenre.forEach((genre, movieList) -> {
            	logger.info(genre + ": " + movieList);
            });

            logger.info("\nAverage Duration:");
            double averageDuration = movies.stream()
                                           .mapToInt(Movie::getDuration)
                                           .average()
                                           .orElse(0.0);
            logger.info(averageDuration);

            //Get movie class into movieClass instance
            Class<?> movieClass = Class.forName("movieshop.Movie");

            logger.info("\nClass Fields:");
            for (Field field : movieClass.getDeclaredFields()) {
            	logger.info(field);
            }

            logger.info("\nClass Methods:");
            for (Method method : movieClass.getDeclaredMethods()) {
            	logger.info(method);
            }

            logger.info("\nClass Constructors:");
            for (Constructor<?> constructor : movieClass.getDeclaredConstructors()) {
            	logger.info(constructor);
            }

            //Create an instance using reflection
            Constructor<?> movieConstructor = movieClass.getConstructor(String.class, String.class, String.class, int.class, int.class);
            Object movieInstance = movieConstructor.newInstance("The Matrix", "Sci-Fi", "The Wachowskis", 1999, 136);
            logger.info("\nCreated Instance: " + movieInstance);

            //Invoke a method using reflection
            Method getTitleMethod = movieClass.getMethod("getTitle");
            Object title = getTitleMethod.invoke(movieInstance);
            logger.info("\nInvoked getTitle Method: " + title);
		
		
            
            
	}
	
}

