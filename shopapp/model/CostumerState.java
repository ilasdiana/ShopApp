package com.sda.javaAdvanced.shopapp.model;

public enum CostumerState {

    NEW("New", false),
    ACTIVE("Active", true),
    CLOSED("Closed", false),
    BANNED("Banned", false);


    private String prettyName;
    private boolean isShoppingActive;


    CostumerState(String prettyName, boolean isShoppingActive) {
        this.prettyName = prettyName;
        this.isShoppingActive = isShoppingActive;
    }

    @Override
    public String toString() {
        return prettyName;
    }

    public boolean isShoppingActive() {
        return isShoppingActive;
    }

}
