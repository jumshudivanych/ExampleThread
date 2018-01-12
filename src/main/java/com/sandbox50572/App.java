package com.sandbox50572;

/**
 * Пример запуска двух потоков
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //Инициализация потока
        Runnable ExampleThread1 = new ExampleThread1("Thread2");

        //Инициализация потока
        Runnable ExampleThread2 = new ExampleThread1("Thread3");

        for(int i=5; i > 0; i--) {

            //Запуск потока
            ExampleThread1.run();
            //Запуск потока
            ExampleThread2.run();

        }

        System.out.println("Работа завершена.");

    }
}
