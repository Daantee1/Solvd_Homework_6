import java.util.*;

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


        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("cherry");
        System.out.println("\nArrayList: " + arrayList);

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("dog");
        hashSet.add("cat");
        hashSet.add("fish");
        System.out.println("\nHashSet: " + hashSet);

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "one");
        hashMap.put(2, "two");
        hashMap.put(3, "three");
        System.out.println("\nHashMap: " + hashMap);

        Queue<String> queue = new LinkedList<>();
        queue.add("first");
        queue.add("second");
        queue.add("third");
        System.out.println("\nQueue: " + queue);
    }


}