package Restaurant;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem item1 = new MenuItem("Salad", 7.50, "Delicious Greens", "Healthy", true);
        MenuItem item2 = new MenuItem("Salad", 7.50, "Delicious Greens", "Healthy", true);
        MenuItem item3 = new MenuItem("Cake", 5.00, "Chocolate", "Desserts", true);

        Menu myMenu = new Menu();
        myMenu.addItem(item1);
        myMenu.addItem(item2);
        myMenu.addItem(item3);

        //myMenu.removeItem(item3);

        System.out.println(myMenu.toString());
        //System.out.println(item1.toString());

    }
}
