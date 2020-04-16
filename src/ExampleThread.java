//Наследование от класса java.lang.Thread и переопределение его метода run
public class ExampleThread extends Thread {
    @Override
    public void run() {
        System.out.println("Привет из побочного потока!");
    }
}

class Program {
    static ExampleThread mSecondThread;

    public static void main(String[] args) {
        mSecondThread = new ExampleThread();
        mSecondThread.start();
        System.out.println("Главный поток завершён...");
    }
}

