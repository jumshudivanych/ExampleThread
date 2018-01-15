package com.sandbox50572;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Coordinator implements Runnable {


    public String s;
    public long a;
    public String s2;
    public long b;

    //конструктор создающий экземпляр класса в новом потоке
    //принимает на вход имя по которому можно обращаться
    //к потоку
    public Coordinator(String s, long a, String s2, long b) {
        this.s = s;
        this.a = a;
        this.s2 = s2;
        this.b = b;


    }

    public void run() {

        //TODO создаем 2 параллельных потока
        //создаем объект Runnable
        Runnable printer1 = new Printer(s, a);
        //создаем поток
        Thread threadP1 = new Thread(printer1);

        //создаем объект Runnable
        Runnable printer2 = new Printer(s2, b);
        //создаем поток
        Thread threadP2 = new Thread(printer2);

        //стартуем потоки
        threadP1.start();
        threadP2.start();

        //ждем завершения работы первого потока
        try {
            threadP1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //ждем завершения работы второго потока
        try {
            threadP2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String s3 = s + " " + s2;
        //создание промежуточного потока
        Runnable printer3 = new Printer(s3, a);
        Thread threadP3 = new Thread(printer3);
        threadP3.start();

    }
}
