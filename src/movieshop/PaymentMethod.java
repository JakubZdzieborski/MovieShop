package movieshop;

public enum PaymentMethod {
    CREDIT_CARD("Pay with credit card"),
    CASH("Pay with cash"),
    ONLINE("Pay online");

    private final String description;

    PaymentMethod(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


    }

