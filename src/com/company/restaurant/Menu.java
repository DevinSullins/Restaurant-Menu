package com.company.restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Menu {
    List<MenuItem> menuItems = new ArrayList<MenuItem>();
    private Date lastUpdate;

    public void addMenuItem(MenuItem aMenuItem){
        if(!aMenuItem.equals("") && !aMenuItem.equals(null) && !menuItems.contains(aMenuItem)) {
            this.menuItems.add(aMenuItem);
            this.lastUpdate = new Date();
        } else {
            System.out.println("Invalid input (duplicate or blank item)");
        }
    }

    public void removeMenuItem(MenuItem aMenuItem){
        if(!aMenuItem.equals("") && !aMenuItem.equals(null)) {
            this.menuItems.remove(aMenuItem);
            this.lastUpdate = new Date();
        }
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public String getMenuItem(String searchTerm) {
        String results = "Results: \n";
        for (MenuItem menuItem : menuItems) {
            if (menuItem.getName().toLowerCase().contains(searchTerm.toLowerCase())) {
                results += menuItem.getName() + ": " + menuItem.getDescription() + "\n" + menuItem.getCategory() + " $" + menuItem.getPrice() + "\n";
            }
        }
        return results;
    }
    public String getMenuItems(){
        String menuList = "";
        for (MenuItem menuItem : menuItems){
            String entry = menuItem.getName() + ": " + menuItem.getDescription() + "\n" + menuItem.getCategory() + " $" + menuItem.getPrice() + "\n";
            if(menuItem.isNew){
                entry += "New!";
            }
            menuList += entry;
        }
        return menuList;
    }
}
