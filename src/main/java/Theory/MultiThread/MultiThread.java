package Theory.MultiThread;

//Следующая программа создает три дочерних потока.
// Создание множественных потоков.

class MultiThread implements Runnable {
    String name; // имя потока
    Thread t;

    MultiThread(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("Новый поток: " + t);
        t.start(); // старт потока
    }

    // Это точка входа для потока,
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + "прерван.");
        }
        System.out.println(name + " завершён.");
    }
}


class MultiThreadDemo {
    public static void main(String args[]) {
        new MultiThread("Первый"); // старт потока
        new MultiThread("Второй");
        new MultiThread("Третий");
        try {
        // ждать завершения других потоков
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Прерывание главного потока.");
        }

        System.out.println("Завершение главного потока.");
    }
}


