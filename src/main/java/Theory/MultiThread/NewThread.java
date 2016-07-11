package Theory.MultiThread;

/**
 * Created by lapte on 31.05.2016.
 */

//Рассмотрим пример, который создает новый поток
// и начинает его выполнение:


// Создание второго потока,
public class NewThread implements Runnable {
    Thread t;

    NewThread() {
        // Создать новый,  второй поток.
        t = new Thread(this, "Demo Thread");
        System.out.println("Дочерний поток:  " + t);
        t.start(); // стартовать поток
    }


    // Это точка входа во второй поток,
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Дочерний Поток:  " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Прерывание дочернего потока");
        }
        System.out.println("Завершение дочернего потока.");
    }
}

class ThreadDemo {
    public static void main(String args []) {
        new NewThread(); // создать новый поток
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Главный поток:  " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Прерывание главного потока.");
        }
        System.out.println("Завершение главного потока.");
    }
}
