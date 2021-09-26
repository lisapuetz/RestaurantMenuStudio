package Restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date dateUpdated;

    public Menu() {
        this.dateUpdated = new Date();
    }

    public ArrayList<MenuItem> getMenuItems() {
        return this.menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getDateUpdated() {
        return this.dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    private void updateDate() {
        this.dateUpdated = new Date();
    }

    public void addItem(MenuItem item) {
        for (MenuItem menuItem : this.menuItems) {
            if (item.equals(menuItem)) {
                System.out.println("Warning: This already exists");
                return;
            }
        }

        this.menuItems.add(item);
        this.updateDate();
    }

    public void removeItem(MenuItem item) {
        this.menuItems.remove(item);
        this.updateDate();
    }

    @Override
    public String toString() {
        String returnString = "";
        for (MenuItem item : this.menuItems) {
            returnString += item.toString() + "\n\n";
        }
        return returnString;
    }

}
