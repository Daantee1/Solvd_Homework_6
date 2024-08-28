import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedListExample<String> list = new LinkedListExample<>();
        list.add("hello");
        list.add("world");
        list.add("how");
        list.add("are");
        list.add("you");
        list.print();
        list.remove("how");
        list.print();
    }
}