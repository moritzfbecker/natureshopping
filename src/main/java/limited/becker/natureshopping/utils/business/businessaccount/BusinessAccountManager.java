package limited.becker.natureshopping.utils.business.businessaccount;

import java.util.HashMap;

public class BusinessAccountManager {

    private final HashMap<String, BusinessAccount> businessAccounts;

    public BusinessAccountManager() {
        businessAccounts = new HashMap<>();
    }

    public void loadAccounts() {
        //TODO: Load accounts out of database
    }

    public BusinessAccount createBusinessAccount(String userID, String email, String password) {
        BusinessAccount businessAccount = new BusinessAccount(userID, email, password);
        businessAccount.setBalance(0);
        businessAccount.setVerified(false);
        businessAccounts.put(userID, businessAccount);
        return businessAccount;
    }

    public BusinessAccount getBusinessAccount(String userID) {
        return businessAccounts.get(userID);
    }
}
