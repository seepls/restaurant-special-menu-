package javaapp;

public class Pastry  extends Cake{
    public void display(){
        System.out.println(super.name+":"+"\u20B9"+super.price+" per peice");
    }

    public Pastry(String n, float f) {
        super(n, f);
    }
}

