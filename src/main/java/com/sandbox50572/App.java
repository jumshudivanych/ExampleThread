package com.sandbox50572;

/**
 * Пример запуска двух потоков
 *
 */
public class App 
{
    public static String s1;
    private static long a;
    private static String s2;
    private static long b;
    private static String s3;
    private static long c;
    private static String s4;
    private static long d;


    public static void main( String[] args )
    {

        s1 = "Первое плечо А";
        s2 = "Первое плечо Б";
        s3 = "Второе плечо А";
        s4 = "Второе плечо Б";
        a = 1000;
        b = 900;
        c = 800;
        d = 700;
        //создание объекта
        Runnable coordinator1 = new Coordinator(s1, a, s2, b);
        //инициализация нового потока
        Thread thread2 = new Thread(coordinator1);
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

        //TODO второй баян в параллельном потоке
        //создание объекта

        Runnable coordinator2 = new Coordinator(s3, c, s4, d);
        //инициализация нового потока
        Thread thread3 = new Thread(coordinator2);
        //стартуем новыи поток
        thread3.start();





    }
}
