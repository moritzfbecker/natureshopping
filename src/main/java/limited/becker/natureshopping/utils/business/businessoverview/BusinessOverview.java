package limited.becker.natureshopping.utils.business.businessoverview;

public class BusinessOverview {

    private String textChannelID;
    private String categoryID;

    public BusinessOverview(String textChannelID, String categoryID) {
        this.textChannelID = textChannelID;
        this.categoryID = categoryID;
    }

    public String getTextChannelID() {
        return textChannelID;
    }

    public void setTextChannelID(String textChannelID) {
        this.textChannelID = textChannelID;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

}
