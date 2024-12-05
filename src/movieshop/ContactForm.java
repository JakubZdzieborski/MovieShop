package movieshop;

import exceptions.movieshop.ClientNotFoundException;
import exceptions.movieshop.InvalidCharactersException;

public class ContactForm {

	private Client client;
	private String message;
	
	public ContactForm(Client client, String message) throws InvalidCharactersException, ClientNotFoundException{
		
		if (!message.matches(("[a-zA-Z0-9 .,!?'\"]+"))) {
			throw new InvalidCharactersException("Invalid characters found in contact message");
		}
		
		if (client == null ) {
			throw new ClientNotFoundException("Client does not exist");
		}
		
		this.client = client;
		this.message = message;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
