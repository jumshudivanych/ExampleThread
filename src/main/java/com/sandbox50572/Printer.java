package com.sandbox50572;

public class Printer implements Runnable {

    //То что печатать
    String s;
    //время задержки
    long a;

    //конструктор создающий экземпляр класса в новом потоке
    //принимает на вход имя по которому можно обращаться
    //к потоку
    public Printer(String s, long a) {
        this.s = s;
        this.a = a;


    }

    public void run() {

        //цикл выводит в консоль
        for(int i=0; i<10; i++) {
            System.out.println(s);
            //время задержки
            try {
                Thread.sleep(a);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
