package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Student{
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    //Переопреділив метод для своїх цілей
    public String toString() {
        return "Імя: " + name + " номер курсу: " + course;
    }

    public static void printStudent(ArrayList<Student> obj) {
        Iterator iterator = obj.iterator();
        while (iterator.hasNext()) {
            Object object;
            object = iterator.next();
            System.out.println(object.toString());
        }
    }

    public boolean equals(Student obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return name == student.name;

    }

    public static void compByName(ArrayList<Student> st) {
        Set<String> s = new HashSet<>();
        System.out.println("===================================\n| В базі данних є Студенти зі схожими іменами: ");
        for (int i = 0; i < st.size(); i++) {
            if (s.add(st.get(i).getName()) == false) {
                String sameName = st.get(i).getName();
                for (int j = 0; j < st.size(); j++)
                    if (st.get(j).getName() == (sameName)) {
                        System.out.println("| " + st.get(j).toString() + "\n|==================================");
                    }
            }
        }
    }
    public static void compByCourse (ArrayList < Student > stu) {
        Set<Integer> set = new HashSet<>();
        System.out.println("===================================\n| В базі данних є студенти, які навчаються на одному курсі: ");
        for (int i = 0; i < stu.size(); i++) {
            if (set.add(stu.get(i).getCourse()) == false) {
                int sameCourse = stu.get(i).getCourse();
                for (int j = 0; j < stu.size(); j++)
                    if (stu.get(j).getCourse() == (sameCourse)) {
                        System.out.println("| " + stu.get(j).toString() + "\n|==================================");
                    }
            }
        }
    }
    public static void findByName(ArrayList<Student> find) throws IOException {
        System.out.println("Введіть імя студента: ");
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        boolean stop = true;
        while (stop) {
                String input = rd.readLine();
                for (int i = 0; i < find.size(); i++) {
                    if(find.get(i).getName().equalsIgnoreCase(input)) {
                        System.out.println(find.get(i).toString());
                        stop = false;
                    }
                }
            }
        }
    public static void findByCourse(ArrayList<Student> find) throws IOException {
        System.out.println("Введіть номер курсу: ");
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        boolean stop = true;
          while(stop){
              try {
              String input = rd.readLine();
              int num = Integer.parseInt(input);
            if(num>=1 & num<=3){
            stop = false;
        for(int i = 0; i<find.size(); i++){
            if(find.get(i).getCourse()==num){
                System.out.println(find.get(i).toString());
            }
        }}else System.out.println("В базі данних є лише курси від 1 до 3...");
          }catch(NumberFormatException e){
              System.out.println("Ви ввели не числове значення, спробуйте ще раз...");
        }
      }
    }
}

