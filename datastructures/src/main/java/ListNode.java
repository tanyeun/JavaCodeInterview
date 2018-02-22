public class ListNode<T> {

    public T data;
    public ListNode<T> next;

    public ListNode() {
    }

    public ListNode(T data, ListNode<T> next) {
        this.data = data;
        this.next = next;
    }

    public ListNode(T data) {
        this.data = data;
        this.next = null;
    }

    public ListNode<T> get(int n) {
        if (n == 1) {
            return this;
        } else if (n < 1) {
            return null;
        } else if (this.next == null){
            throw new RuntimeException("Index out of bounds.");
        } else {
            return this.next.get(--n);
        }
    }

    public int length() {
        ListNode<T> node = this;
        int len = 1;
        while (node.next != null) {
            node = node.next;
            ++len;
        }
        return len;
    }

    public void insertAfter(ListNode<T> node) {
        node.next = this.next;
        this.next = node;
    }

    @Override
    public String toString() {
        ListNode<T> current = this.next;
        StringBuilder list = new StringBuilder();
        list.append(this.data.toString()+" -> ");
        while (current != null) {
            list.append(current.data.toString()+" -> ");
            current = current.next;
        }
        list.append("null");
        return list.toString();
    }
}
