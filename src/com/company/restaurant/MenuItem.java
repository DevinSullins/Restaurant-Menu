package com.company.restaurant;

import java.util.Calendar;
import java.util.Date;

public class MenuItem {
    private String name;
    private Double price;
    private String description;
    private String category;
    private Date dateAdded = new Date();
    private boolean isNew;

//I know how to do validation, I'm just being lazy
    public MenuItem(String name, Double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
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

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        Date date = new Date();
    }
}
