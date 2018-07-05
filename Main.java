package com.internshala.javaapp;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Cake c1 = new Cake("Chocolate Brownie",250.0f);
        Cake c2 = new Cake("Chocolate Maple",300.0f);
        List<Cake> cakeList = new ArrayList();

        cakeList.add(0,c1 );
        cakeList.add(1,c2);

        Pastry p1 = new Pastry("Black forest",35.0f );
        Pastry p2 = new Pastry("Choco Truffle",40.0f);

        List<Pastry> pastryList = new ArrayList();

        pastryList.add(0,p1);
        pastryList.add(1,p2);

        System.out.println("              Today's Special Menu");
        System.out.println("------------------------------------------------");
        System.out.println("Special Cakes ");
        System.out.println("------------------------------------------------");
        for(Cake cake : cakeList){
            cake.display();
        }
        System.out.println("Special Pastries ");
        System.out.println("------------------------------------------------");
        for(Pastry pastry : pastryList){
            pastry.display();
        }





    }

}



