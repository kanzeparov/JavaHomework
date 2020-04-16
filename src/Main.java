//Реализация интерфейса java.lang.Runnable и создание потока на основе этой реализации.
public class Main {
    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("This is second thread");
            }
        });
        myThread.start();
        System.out.println("Main thread is over");
    }
}
