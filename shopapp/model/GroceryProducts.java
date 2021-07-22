package com.sda.javaAdvanced.shopapp.model;

import java.time.Instant;
import java.util.Date;

public class GroceryProducts extends FoodProduct {

    private Double price;
    private String name;
    private String currency;
    private String description;
    private String id;

    public GroceryProducts(
            Date expirationDate,
            boolean isBio,
            String countryOfOrigin,
            Double price,
            String name,
            String currency,
            String description,
            String id
    ) {
        super(expirationDate, isBio, countryOfOrigin);
        if (expirationDate.before(Date.from(Instant.now()))){
            throw new IllegalArgumentException("Product expired!");
        }
        if (price != null && price > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Invalid price!");
        }

        this.name = name;
        this.currency = currency;
        this.description = description;
        this.id = id;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getCurrency() {
        return currency;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getID() {
        return id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(String id) {
        this.id = id;
    }
}
