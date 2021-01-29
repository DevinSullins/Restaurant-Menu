package com.company.restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Menu {
    List<MenuItem> menuItems = new ArrayList<MenuItem>();
    private Date lastUpdate;

    public void addMenuItem(MenuItem aMenuItem){
        if(!aMenuItem.equals("") && !aMenuItem.equals(null)) {
            this.menuItems.add(aMenuItem);
            this.lastUpdate = new Date();
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

    public String getMenuItems() {
        String menuList = "";
        for (MenuItem menuItem : menuItems){
            String entry = menuItem.getName() + ": " + menuItem.getDescription() + "\n" + menuItem.getCategory() + " $" + menuItem.getPrice() + "\n";
            menuList += entry;
        }
        return menuList;
    }
}
