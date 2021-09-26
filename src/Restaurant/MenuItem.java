package Restaurant;

public class MenuItem {

    private String itemName;
    private Double itemPrice;
    private String itemDescription;
    private String itemCategory;
    private Boolean isNew;

    public MenuItem (String name, Double price, String description, String category) {
        this.itemName = name;
        this.itemPrice = price;
        this.itemDescription = description;
        this.itemCategory = category;
        this.isNew = false;
    }

    public MenuItem (String name, Double price, String description, String category, Boolean isNew) {
        this.itemName = name;
        this.itemPrice = price;
        this.itemDescription = description;
        this.itemCategory = category;
        this.isNew = isNew;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getItemPrice () {
        return this.itemPrice;
    }

    public void setItemPrice (Double aPrice) {
        this.itemPrice = aPrice;
    }

    public String getItemDescription () {
        return this.itemDescription;
    }

    public void setItemDescription (String aDescription) {
        this.itemDescription = aDescription;
    }

    public String getItemCategory () {
        return this.itemCategory;
    }

    public void setItemCategory (String aCategory) {
        this.itemCategory = aCategory;
    }

    public Boolean isNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    @Override
    public String toString() {
        String returnString = "";
        returnString += "Name: " + this.itemName + "\n";
        returnString += "Price: " + this.itemPrice + "\n";
        returnString += "Description: " +this.itemDescription + "\n";
        returnString += "Category: " +this.itemCategory + "\n";
        returnString += "Is it new?: " + this.isNew + "\n";
        return returnString;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof MenuItem)) {
            return false;
        }
        MenuItem menuItem = (MenuItem) obj;
        if (menuItem.itemName.equals(this.itemName)
                && menuItem.itemDescription.equals(this.itemDescription)
                && menuItem.itemPrice.equals(this.itemPrice)
                && menuItem.itemCategory.equals(this.itemCategory)) {
            return true;
        } else {
            return false;
        }
    }

}
