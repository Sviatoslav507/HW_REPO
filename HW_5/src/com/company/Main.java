package com.company;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        MathCheck check = new MathCheck();
        System.out.println();
        check.intCheck();
        check.checkFloatStart();
        HTTPSErrors error = new HTTPSErrors();
        error.httpsErrorStart();
Dog[] dog = new Dog[3];
        dog[0] = new Dog("Барсик", Dog.breed.BULLDOG, 2);
        dog[1] = new Dog("Bobik", Dog.breed.DALMATIAN, 4);
        dog[2] = new Dog("Bobko", Dog.breed.MASTIFF, 1);
        for(int i=0; i< dog.length; i++){
            dog[i].dogInfo();
        }
        System.out.println("Найстарший собака");
        int [] age = new int[dog.length];
        int index=0;
        for(int i = 0; i< dog.length; i++){
            age[i] = dog[i].getAge();
            Arrays.sort(age);
            if(dog[i].getAge()==age[2]){
               index = i;
            }
        }
        dog[index].dogInfo();
        }

    }
        class MathCheck {
            private float[] numer = new float[3];
            private int[] numerInt = new int[3];
            public  void checkFloatStart() {
                int count = 0;
                System.out.println("\t\t\t\tМетод для перевірки чисел");
                Scanner fsc = new Scanner(System.in);
                System.out.println("Введіть 3 числа з плаваючою крапкою від \"-5\" до \"5\"");
                while (count < numer.length) {
                    if (!fsc.hasNextFloat()) {
                        System.out.println("Ви ввели не числове значення, спробуйте знову...");
                        fsc.next();
                    } else {
                        numer[count] = fsc.nextFloat();
                        count++;
                    }
                }
                count = 1;
                System.out.println("Ваші числа після перевірки: ");
                for (int i = 0; i < numer.length; i++) {
                    if (numer[i] >= -5 & numer[i] <= 5) {
                        System.out.println("Число номер " + count + ") - " + numer[i] + " входить в діапазон");
                        count++;
                    } else {
                        System.out.println("Число номер " + count + ") - " + numer[i] + " не входить в діапазон");
                        count++;
                    }
                }
            }
            public void intCheck(){
                int max = 0;
                int count = 0;
                System.out.println("Тепер введіть три цілих числа");
                Scanner isc = new Scanner(System.in);
                while(count < numerInt.length){
                    if(!isc.hasNextInt()){
                        System.out.println("Ви ввели не число, або не ціле число, спробуйте знову...");
                        isc.next();
                    }else{
                        numerInt[count] = isc.nextInt();
                        count++;
                    }
                    System.out.println("Ви ввели "+Arrays.toString(numerInt)+" числа");

                }
                //Простий алгоритм бульбашкового сортування. Можна через вбудований метод, але треба трохи практикуватись))
                for(int j = 0; j < numerInt.length; j++){
                    for(int i = 0; i < numerInt.length-1;i++) {
                        if (numerInt[i] > numerInt[i+1]) {
                            max = numerInt[i];
                            numer[i] = numerInt[i+1];
                            numer[i+1] = max;
                        }
                    }
                }
                System.out.println("Мінімальне значення "+ numerInt[0]);
                System.out.println("Максимальне значення "+ numerInt[numerInt.length-1]);
            }
        }

    //    };
  //  }

class Dog{
private int age;
private String name;
// це приватне поле сворив для передачі enum'у в конструктор
private breed enBreed;
private String translate;
    public int getAge() {
        return age; }
    public String getName() {
        return name; }
    //enum створив із конструктором
enum breed{
    DALMATIAN("Далматинець"), BULLDOG("Бульдог"), MASTIFF("Мастифф");
    private String tarnslate;
    breed(String translate){
        this.tarnslate = translate;
    }
        }
    public Dog(String name, breed enBreed, int age){
        this.name = name;
        this.age = age;
        this.enBreed = enBreed;
}

public void dogInfo(){
        System.out.println("Гав, мене звати "+name+" мій вік "+age+" Моя порода "+enBreed+" по українськи це звучить як "+enBreed.tarnslate);
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && name.equals(dog.name) && enBreed == dog.enBreed && translate.equals(dog.translate);
    }
    @Override
    public int hashCode() {
        return Objects.hash(age, name, enBreed, translate);
    }
}
class HTTPSErrors {
    enum ErrorCode {
        BAD_REQUEST(400), UNAUTORIZED(401), PAYMENT_REQUIRED(402), FORBIDDEN(403), NOT_FOUND(404);
        //В enum вклав конструктор, щоб звязати код помилки із назвою помилки, така собі база данних))))
        private int code;

        ErrorCode(int code) {
            this.code = code;
        }

        public int getCode() {
            return code;
        }
    }

    public void httpsErrorStart(){
        System.out.println("Введіть код помилки");
        Scanner err = new Scanner(System.in);
        int code = 0;
        boolean exit = false;
        while(!exit){
        if(!err.hasNextInt()){
            System.out.println("Ви ввели не числове значення, спробуйте ще раз...");
            err.next();
        }else{
            code = err.nextInt();
        for (ErrorCode e : ErrorCode.values()) {
            if (code == e.getCode() & (code >= 400) & (code <= 404)){
                System.out.println(e);
                err.close();
                exit = true;
            }
        }
        }
        }
    }
}