package movieshop;

public class Membership {

	private Client client;
	private boolean member;
	
	public Membership(Client client, boolean member) {
		
		this.client = client;
		this.member = member;
	}
	
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public boolean isMember() {
		return member;
	}
	public void setMember(boolean member) {
		this.member = member;
	}
	
	
}
