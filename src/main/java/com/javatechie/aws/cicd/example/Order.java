package com.javatechie.aws.cicd.example;

public class Order {

    public  Order(int id,String name,int quantity,int price){
        this.id=id;
        this.name=name;
        this.quantity=quantity;
        this.price=price;

    }
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private int id;
    private String name;
    private int quantity;
    private int price;

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }


}
