package unit5;

public class OutOfMemoryExample {

    public static void main(String[] args) throws InterruptedException {
        int step = 10;
        int i = 0;
        try {
            while(true){
                i++;
                byte[] a = new byte[(int) Math.pow(step, i)];
                Thread.sleep(1000);
                a = null;
                System.out.println((int)Math.pow(step, i));
            }
        } catch (OutOfMemoryError e) {
            System.out.println(e);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
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
