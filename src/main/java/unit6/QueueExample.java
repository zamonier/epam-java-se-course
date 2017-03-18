package unit6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.function.Function;

public class QueueExample {

    public static void main(String[] args) {

        queueApply(getQueue(LinkedList.class), Queue::poll);

        queueApply(getQueue(LinkedList.class), Queue::remove);

    }

    private static void queueApply(Queue<String> queue, Function<Queue<String>, String> function) {
        while (queue.size() > 0) {
            System.out.print(function.apply(queue));
            System.out.println(queue);
        }
    }


    public static Queue<String> getQueue(Class<? extends Queue> cl) {
        try {
            Queue<String> q = (Queue<String>) cl.newInstance();
            q.offer("Oklahoma");
            q.offer("Indiana");
            q.offer("Georgia");
            q.offer("Texas");
            return q;
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        throw new IllegalArgumentException();
    }
}
