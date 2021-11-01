package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
    Plant plant = new Plant("Kit", "Lviv", 5);
    //результати заокруглив через Math.round();
    System.out.println("Периметр кола " +Math.round(plant.perimeter())+" сантиметрів");
    System.out.println("Площа кола " +Math.round(plant.area())+" сантиметрів");
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Перше питання ");
        //перевірку умови вирішив вкласти в безкінечний цикл, коли умова виконується, активується оператор "break" і цикл розривається.
        for(;;){
            String question1 = rd.readLine();
        if(question1.equals("What is your name?")){plant.plantSay();
        break;
        }}
        System.out.println("Друге питання ");
        for(;;){
            String question2 = rd.readLine();
        if(question2.equals("Where are you live?")){plant.plantAddress();
        break; }}
    }
}
class Plant{

    private String name;
   private String address;
   private double radius;
   //так як число "пі" є константою - вказую "final"
   private final double Pi = 3.14;
    public Plant(String name, String address, double radius){
        this.name = name;
        this.address = address;
        this.radius = radius;
        }

    public String getName() {
        return name;
    }

    //методи які отримують данні через конструктор та повертають результат
    public double area(){
        double result = Math.pow(radius, 2) * Pi;
        return result;
    }
    public double perimeter(){
        double result = (radius*2) * Pi;
        return result;
    }
    public void plantSay(){
        System.out.println("My name is - "+name);
    }
    public void plantAddress(){
        System.out.println("I live in "+address);
    }
    }

