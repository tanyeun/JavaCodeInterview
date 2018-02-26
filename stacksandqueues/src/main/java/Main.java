import java.util.ArrayDeque;
import java.util.Deque;

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
    }
}