public class DeadLock {
    private static class PingPong {
        synchronized void ping(PingPong pingPong) {
            System.out.println("ping");
            pingPong.pong(this);
        }

        synchronized void pong(PingPong pingPong) {
            System.out.println("pong");
            pingPong.ping(this);
        }
    }

    public static void main(String[] args) {
        PingPong ping = new PingPong();
        PingPong pong = new PingPong();

        Thread t1 = new Thread(() -> ping.ping(pong));//лямбда выражение)
        Thread t2 = new Thread(() -> pong.pong(ping));//лямбда выражение)
        t1.start();
        t2.start();
    }
}
