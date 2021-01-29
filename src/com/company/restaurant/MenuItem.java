package com.company.restaurant;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class MenuItem {
    private String name;
    private Double price;
    private String description;
    private String category;
    private Date dateAdded;
    protected boolean isNew;

//I know how to do validation, I'm just being lazy
    public MenuItem(String name, Double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateAdded = new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    /*public boolean isNew() {
        Date today = new Date();
        if (dateAdded.before(today.add()))
        return isNew;
    }*/

    public void setNew(boolean aNew) {
        Date date = new Date();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(name, menuItem.name) && Objects.equals(price, menuItem.price) && Objects.equals(description, menuItem.description) && Objects.equals(category, menuItem.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, description, category);
    }
}
