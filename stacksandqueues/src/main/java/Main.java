import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Stack & Queue");
        Deque<Integer> st = new ArrayDeque<>();

        st.addFirst(6); // equivalent to push
        st.addFirst(2);
        st.addFirst(3);
        st.addFirst(5);
        st.push(8);

        System.out.println(st.peek()); // peek read the first element, but not remove

        st.pop();                      // remove and return the first/top element

        System.out.println(st.peek());

        Stack<String> st1 = new Stack<>();
        st1.push("hello");
        st1.push("world");
        st1.push("foo");
        st1.push("bar");
        System.out.println(st1.peek());
        System.out.println(st1);
        System.out.println(st1.pop());
        System.out.println(st1);

        Queue<Integer> que = new LinkedList<>();  // LinkedList implements Queue, actually
                                                  // also can implements Stack
    }
}