package movieshop;

public enum TransactionType {
    BUY("Buy a movie"),
    RENT("Rent a movie");
    
    private final String description;

    TransactionType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

  
}

