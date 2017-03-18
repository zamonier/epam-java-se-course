package unit6;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;

public class QueueExample {

    public static void main(String[] args) {

        queueApply(createFilledQueue(LinkedList<String>::new), Queue::poll);
        queueApply(createFilledQueue(LinkedList<String>::new), Queue::remove);
        queueApply(createFilledQueue(ArrayDeque<String>::new), Queue::poll);
        queueApply(createFilledQueue(ArrayDeque<String>::new), Queue::remove);
        queueApply(createFilledQueue(PriorityQueue<String>::new), Queue::poll);
        queueApply(createFilledQueue(PriorityQueue<String>::new), Queue::remove);

        queueApply(
                createFilledQueue(
                        () -> new PriorityQueue<>(10, Collections.reverseOrder())),
                Queue::poll);
        queueApply(
                createFilledQueue(
                        () -> new PriorityQueue<>(10, Collections.reverseOrder())),
                Queue::remove);

    }

    private static void queueApply(Queue<String> queue, Function<Queue<String>, String> function) {
        while (queue.size() > 0) {
            System.out.print(function.apply(queue));
            System.out.println(queue);
        }
    }

    private static Queue<String> createFilledQueue(Supplier<? extends Queue<String>> s) {
        Queue<String> q = s.get();
        q.offer("Oklahoma");
        q.offer("Indiana");
        q.offer("Georgia");
        q.offer("Texas");
        return q;
    }

}
