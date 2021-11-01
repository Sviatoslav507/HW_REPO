package com.company;



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char last = '0';
        char first = '0';
        Scanner sc = new Scanner(System.in);
        // за замовчуванням вказую фолс, перевіркаі вже відбувається в операторі "if"
        boolean istrue = false;
        System.out.println("Введіть число яке хочете перевірити");
        //Зчитую число із клавіатури та піднімаю до степені. Можна також реалізувати без масивів, використовуючи "%"
        int num = sc.nextInt();
        int pow = num * num;
        System.out.println("Отримали число " + pow);
        String nums = Integer.toString(pow);
        char[] ch = nums.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '3') {
                istrue = true;
            }
            first = ch[0];
            last = ch[ch.length - 1];
        }
        // тут відбувається заміна першого значення на останнє
        ch[0] = last;
        ch[ch.length - 1] = first;
        if (istrue) {
            System.out.println("Цифра \"3\" входить в число");
        } else {
            System.out.println("Цифра \"3\" не входить в число");
        }
        System.out.println("Число зі зміненим порядком");
        //цикл for-each
        for (char number : ch) {
            System.out.print(number);
        }
    }
}