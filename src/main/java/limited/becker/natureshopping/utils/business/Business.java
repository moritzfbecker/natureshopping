package limited.becker.natureshopping.utils.business;

import limited.becker.natureshopping.NatureShopping;
import limited.becker.natureshopping.utils.business.businessaccount.BusinessAccount;
import limited.becker.natureshopping.utils.business.businessoverview.BusinessOverview;
import net.dv8tion.jda.api.entities.Guild;

public class Business {

    private final String businessID; //IS ALSO THE BUSINESS GUILD ID
    private final Guild businessGuild;
    private BusinessAccount businessOwner;

    private BusinessOverview businessOverview;

    public Business(String businessID) {
        this.businessID = businessID;
        this.businessGuild = NatureShopping.getJda().getGuildById(businessID);
    }

    public Business(Guild businessGuild) {
        this.businessGuild = businessGuild;
        this.businessID = businessGuild.getId();
    }

}
