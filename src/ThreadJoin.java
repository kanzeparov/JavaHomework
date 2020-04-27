public class ThreadJoin {
    private static class Incrementor {
        int i = 0;

        void act() {
            for (int j = 0; j < 10; j++) {
                System.out.println(i++);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Incrementor incrementor = new Incrementor();
        Thread t1 = new Thread(incrementor::act);
        Thread t2 = new Thread(() -> {
            try {
                System.out.println("t2 init");
                t1.join();
                System.out.println("t2 start");
                incrementor.act();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t3 = new Thread(() -> {
            try {
                System.out.println("t3 init");
                t2.join();
                System.out.println("t3 start");
                incrementor.act();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
        t2.start();
        t3.start();
    }
}
