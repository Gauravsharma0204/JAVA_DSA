package _09_CollectionsFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    void main(){
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(10);
        deque.offer(20);
        deque.offerFirst(5);
        deque.offerLast(25);

        System.out.println(deque);

        deque.poll();
        deque.pollLast();
        System.out.println(deque);
    }
}
