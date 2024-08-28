package collections;


import java.util.LinkedList;
import java.util.Queue;

public class MyQueue<T> extends MyCollection<T> {
    Queue<T> queue = new LinkedList<>();
}
