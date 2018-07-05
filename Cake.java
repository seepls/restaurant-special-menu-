package com.internshala.javaapp;

public class Cake {
    String name;
    float price;
    public Cake(String n , float f){
        this.name=n;
        this.price = f;

    }


    public Cake() {
    }

    public String getName() {

        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public void display(){
        System.out.println(this.name+":"+"\u20B9"+this.price+" per pound");
    }
}
