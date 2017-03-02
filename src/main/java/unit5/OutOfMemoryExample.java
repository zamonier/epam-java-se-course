package unit5;

public class OutOfMemoryExample {

    public static void main(String[] args) throws InterruptedException {
        int step = 10;
        int i = 0;
        byte[] a;
        try {
            while(true){
                i++;
                a = new byte[(int) Math.pow(step, i)];
                Thread.sleep(1000);
                a = null;
                System.out.println((int)Math.pow(step, i));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            a = null;
            Thread.sleep(1000);
            System.gc();
            System.gc();
            System.gc();
            System.gc();
        }
        System.out.println("------");
        byte[] b = new byte[(int) Math.pow(step, i-1)];
        System.out.println(b);
    }
}
