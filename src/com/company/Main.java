package com.company;

import com.company.restaurant.Menu;
import com.company.restaurant.MenuItem;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Menu menu = new Menu();
        MenuItem spaghetti = new MenuItem("Spaghetti", 8.99, "Noodles with red sauce, Italian", "Main Course");
        MenuItem iceCream = new MenuItem("Ice Cream", 4.99, "Really decent vanilla ice cream", "Dessert");
        menu.addMenuItem(spaghetti);
        menu.addMenuItem(iceCream);

        System.out.println(menu.getMenuItems());
    }
}
