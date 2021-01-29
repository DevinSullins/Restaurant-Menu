package com.company.restaurant;

public class Restaurant {
    public static void main(String[] args) {
        Menu restaurantMenu = new Menu();
        MenuItem steak = new MenuItem("Steak", 14.99, "Big ol' steak", "Entree");
        MenuItem iceCream = new MenuItem("Ice Cream", 14.99, "A 15 dollar serving of Ice Cream. Randomized flavor.", "Dessert");
        MenuItem nachos = new MenuItem("Nachos", 14.98, "One penny less than the Steak and the Ice Cream. It's not a bargain.", "Apps Apps Baby");
        MenuItem beer = new MenuItem("One Big Beer", 15.00, "15 dollars, but no one has ever finished one.", "Beverages, Alcoholic and Otherwise");

        restaurantMenu.addMenuItem(steak);
        restaurantMenu.addMenuItem(iceCream);
        restaurantMenu.addMenuItem(nachos);
        restaurantMenu.addMenuItem(beer);

        System.out.println(restaurantMenu.getMenuItems());
        System.out.println(restaurantMenu.getMenuItem("a"));

        restaurantMenu.removeMenuItem(iceCream);
        System.out.println(restaurantMenu.getMenuItems());
        restaurantMenu.addMenuItem(steak);
    }
}
