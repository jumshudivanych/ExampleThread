package com.sandbox50572;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ExampleThread1 implements Runnable {

    public String name;//имя потока
    public int time;//время засыпания потока

    Random random = new Random();//инициализация генератора случаиных чисел

    //конструктор создающий экземпляр класса в новом потоке
    //принимает на вход имя по которому можно обращаться
    //к потоку
    public ExampleThread1(String name) {
        this.name = name;

        //TODO Перевести в секунды!!!
        //инициализация временнои переменнои и

        //получение случаиного числа
        //в диапазоне до 1000
        int a = random.nextInt(1000);
        //миллисекунды -> секунды
        //time = a * 1000;
        //TODO проверка
        time = a;
    }

    public void run() {

        //вывод на экран номера потока
       System.out.println("Запущен дочернии поток " + name + " " + time);

       //засыпание потока на случайное число
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
