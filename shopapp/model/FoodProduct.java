package com.sda.javaAdvanced.shopapp.model;

import java.time.Instant;
import java.util.Date;

public abstract class FoodProduct implements Sellable{

    private static final String FOOD_CATEGORY= "Food";
    private Date expirationDate;
    private boolean isBio;
    private  String countryOfOrigin;

    public FoodProduct(Date expirationDate, boolean isBio, String countryOfOrigin) {
        if (expirationDate.before(Date.from(Instant.now()))){
            throw new IllegalArgumentException("Product expired!");
        }
        this.expirationDate = expirationDate;
        this.isBio = isBio;
        this.countryOfOrigin = countryOfOrigin;
    }

    @Override
    public String getProductCategory() {
        return FOOD_CATEGORY;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public boolean isBio() {
        return isBio;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }
}
