package com.sandbox50572;

/**
 * Пример запуска двух потоков
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //создание объекта
        Runnable exampleThread2 = new ExampleThread1("Thread2");
        //инициализация нового потока
        Thread thread2 = new Thread(exampleThread2);
        //стартуем новыи поток
        thread2.start();

        /*
        //TODO привязаться к потоку и ждать завершения его работы
        //для продолжения
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        */

        //создание объекта
        Runnable exampleThread3 = new ExampleThread1("Thread3");
        //инициализация нового потока
        Thread thread3 = new Thread(exampleThread3);
        //стартуем новыи поток
        thread3.start();



        for(int i=5; i > 0; i--) {

            //выполнение в main потоке
            System.out.println("основной поток метод main.");
            //засыпание основного потока
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
