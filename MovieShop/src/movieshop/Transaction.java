package movieshop;

import java.util.Objects;

public abstract class Transaction {

	protected Client client;
	protected Movie movie;
	protected double tax;
	protected String transactionId;
	protected String transactionDate;
	

	public Transaction(Client client, Movie movie, double tax, String transactionId, String transactionDate) {
		this.client = client;
		this.movie = movie;
		this.tax = tax;
		this.transactionId = transactionId;
		this.transactionDate = transactionDate;
	}

	protected abstract void processTranscation();

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	@Override
	public String toString() {
        return "Client: " + client + ", Movie: " + movie + ", Transaction Date: " + transactionDate + ", Transaction ID: " + transactionId + ", Transaction tax: " + tax;
	}

	@Override
	public int hashCode() {
		return Objects.hash(client, movie, tax, transactionDate, transactionId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		return Objects.equals(client, other.client) && Objects.equals(movie, other.movie)
				&& Double.doubleToLongBits(tax) == Double.doubleToLongBits(other.tax)
				&& Objects.equals(transactionDate, other.transactionDate)
				&& Objects.equals(transactionId, other.transactionId);
	}

	
	
	
	
}
