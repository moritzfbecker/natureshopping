package limited.becker.natureshopping.utils.business;

import java.util.HashMap;

public class BusinessManager {

    private final HashMap<String, Business> businesses;


    public BusinessManager() {
        this.businesses = new HashMap<>();
    }

    public void loadBusinesses() {

    }

    public Business getBusiness(String businessID) {
        return businesses.get(businessID);
    }

}
