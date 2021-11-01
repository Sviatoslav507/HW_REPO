package com.company;

import java.util.Calendar;


public class Main {

    public static void main(String[] args) {
        //обєкти класу Персон створив в масиві, для зручності і через цикл вивів інформацію про кожен окремий обєкт
        Person[] pers = new Person[5];
        pers[0] = new Person("Василь", 1999);
        pers[1] = new Person("Святослав", 1960);
        pers[2] = new Person("Ярослав", 2007);
        pers[3] = new Person("Тетяна", 1980);
        pers[4] = new Person("Петруха", 1995);
        for(int i = 0; i < pers.length; i++){
            pers[i].personInfo();
            System.out.println();
        }
    }
}
class Person{
    private String name;
    private int birthYear;
    private int age;
    public Person(){}
    public Person(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }
   // input методи, для вказування параметрів обєктів. Для розрахунку віку використав клас Calendar
    public void setBirthYear(int birthYear) { this.birthYear = birthYear; }
    public void сhangeName(String name) { this.name = name; }
    public int age(){
        Calendar cal = Calendar.getInstance();
        int age = cal.get(Calendar.YEAR) - birthYear;
        return age;
    }
    //output метод, виводить інформацію про обєкт
    public void personInfo(){
        System.out.println("Привіт, мене звати "+name+ "\nМій вік "+age());
    }
}
