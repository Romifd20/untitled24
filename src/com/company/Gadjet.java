package com.company;

public class Gadjet {


    private String sistem;
    private String name;
    private String model,color;

    int year;


    public Gadjet(String name, String color ,String model , int year) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.model = model;

    }


    public Gadjet(String name, String color, int year) {

    }


    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }


    public String getModel(){
        return model;
    }


    public void makeZvon(int number, String zvon) {
        for (int i = 0; i < number; i++) {
            System.out.println(zvon);
        }


            }
            public void printInfo(){
                System.out.println(name + " " + model + " " + color + " " + year );
            }
        }





