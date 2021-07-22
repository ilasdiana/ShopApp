package com.sda.javaAdvanced.shopapp.model;

public class Costumer {
    private String id;
    private String address;
    private String phone;
    private String email;
    private Account account;
    private CostumerState costumerState;


    public Costumer(String id, String address, String phone, String email, Account account, CostumerState costumerState) {
        this.id = id;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.account = account;
        this.costumerState = costumerState;
    }

    @Override
    public String toString() {
        return "Costumer{" +
                "id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", account=" + account +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }


    public CostumerState getCostumerState() {
        return costumerState;
    }

    public void setCostumerState(CostumerState costumerState) {
        this.costumerState = costumerState;
    }
}
