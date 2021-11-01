package com.company;

public class Main {

    public static void main(String[] args) {

    Zenith zenith = new Zenith(false, 32);
    zenith.zenithCheck();
   for(int i =0; i<36; i++){
        zenith.zenithRew();
        zenith.makePhoto();
    }
        System.out.println(zenith.toString());
    }
}
//Описую логіку радянського плівкового фотоапрату - Зеніт
class Zenith{
    private int count; // лічильник кадрів
    private boolean isEmpty; //змінна true - фотоапарат "заряджений" плівкою;
    private int frames = 36; // максимальна кількість кадрів;
    private boolean rewinded = false; //цей параметр перевіряє чи затвор фотоапарату взведений, без цього фото зробити неможливо
    public int getCount() {
        return count;
    }

    public Zenith(boolean isEmpty){
        this.isEmpty = isEmpty;
    }
    public Zenith(boolean isEmpty, int count){
        this.count = count;
        this.isEmpty = isEmpty;
    }
    public void zenithCheck(){
        if (isEmpty == true){
            System.out.println("Фотоапарат пустий");
        count = 0;
        } else{ System.out.println("В фотоапараті є плівка");
            System.out.println("Кількість кадрів "+count);
        }
    }
    public String toString() {
        return "Zenith{" +
                "frame=" + frames +
                ", count='" + count + '\'' +
                ", isEmpty=" + isEmpty +
                ", rewinded=" + rewinded +
                '}';}
    public void zenithRew(){
        rewinded = true;
        if(count < frames){
        System.out.println("Затвор взведений, фотоапарат готовий ");}
    }
    public void makePhoto(){
        //перевірка умов, важливо щоб ці три умови були обовязково виконані, без них фото не буде ;(
       while(count < frames){
        if(isEmpty == false & rewinded == true){ System.out.println("Фото зроблене, залишилось "+(frames - count)+" кадрів");
        count++;}
        else if (isEmpty == true) System.out.println("Перш ніж зробити фото, зарядіть плівку!");
        else if (isEmpty == false & rewinded == false) System.out.println("Плівка заряджена, але потрібно взвести затвор");
        if(count == frames){
            System.out.println("Останній кадр зроблений, плівка закінчилась!");
        }break;}
    }
}
