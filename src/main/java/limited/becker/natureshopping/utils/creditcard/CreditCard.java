package limited.becker.natureshopping.utils.creditcard;

public class CreditCard {

    private final String cardNumber;
    private final String cardHolderName;
    private final ExpirationDate expirationDate;
    private final int cvcCode;

    public CreditCard(String cardNumber, String cardHolderName, ExpirationDate expirationDate, int cvcCode) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
        this.cvcCode = cvcCode;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public ExpirationDate getExpirationDate() {
        return expirationDate;
    }

    public int getCvcCode() {
        return cvcCode;
    }
}
