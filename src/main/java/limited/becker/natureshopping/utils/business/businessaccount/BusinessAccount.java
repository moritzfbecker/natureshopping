package limited.becker.natureshopping.utils.business.businessaccount;

import limited.becker.natureshopping.utils.creditcard.CreditCard;

public class BusinessAccount {

    private final String userID;
    private String emailAddress;
    private String password;

    private boolean verified;

    private int balance;
    private CreditCard creditCard;

    public BusinessAccount(String userID) {
        this.userID = userID;
    }

    public BusinessAccount(String userID, String emailAddress, String password) {
        this.userID = userID;
        this.emailAddress = emailAddress;
        this.password = password;
    }

    public BusinessAccount(String userID, String emailAddress, String password, boolean verified) {
        this.userID = userID;
        this.emailAddress = emailAddress;
        this.password = password;
        this.verified = verified;
    }

    public BusinessAccount(String userID, String emailAddress, String password, boolean verified, int balance) {
        this.userID = userID;
        this.emailAddress = emailAddress;
        this.password = password;
        this.verified = verified;
        this.balance = balance;
    }

    public BusinessAccount(String userID, String emailAddress, String password, boolean verified, int balance, CreditCard creditCard) {
        this.userID = userID;
        this.emailAddress = emailAddress;
        this.password = password;
        this.verified = verified;
        this.balance = balance;
        this.creditCard = creditCard;
    }

    public String getUserID() {
        return userID;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
}
