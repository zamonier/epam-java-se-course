package unit7.runnable;

public class ThreadDemo {

    public static class Walk implements Runnable {
        public void run() {
            for (int i = 0; i < 18; i++) {
                System.out.println("Walking");
                try {
                    Thread.sleep(400);
                    System.exit(1);
                    throw new RuntimeException();
                } catch (InterruptedException e) {
                    System.err.println(e);
                    System.err.flush();
                }
            }
        }
    }

    public static class Talk extends Thread {
        public void run() {
            for (int i = 0; i < 8; i++) {
                System.out.println("Talking");
                try {
                    Thread.sleep(800);
                } catch (InterruptedException e) {
                    System.err.println(e);
                    System.err.flush();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Talk talk = new Talk();
        Thread walk = new Thread(() -> {
            System.out.println(111);
        });
        talk.setDaemon(true);
//        new Walk().run();
        talk.start();
        Thread.sleep(3000);
        walk.start();
//        Talk talk2 = new Talk();
//        talk2.start();
        throw new RuntimeException();
    }
}
