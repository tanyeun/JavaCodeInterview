import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello BST");
        TreeMap<Integer, String> bstMap = new TreeMap<>();
        bstMap.put(1, "foo");
        bstMap.put(2, "bar");
        bstMap.put(3, "hello");

        TreeSet<Integer> bstSet = new TreeSet<Integer>();
        int[] input = {1,2,1,3,1,9,7,13,5,27};
        for(int e : input) bstSet.add(e);
        System.out.println(bstSet.first());
        System.out.println(bstSet.last());
        System.out.println(bstSet.lower(5));    // return element < x
        //System.out.println(bstSet.lower(null)); // NullPointerException
        System.out.println(bstSet.higher(10));  //                > x
        System.out.println(bstSet.floor(5));    //                <= x
        System.out.println(bstSet.ceiling(10)); //                >= x
        System.out.println(bstSet.toString());
        System.out.println(bstSet.headSet(3));      // return list < x
        System.out.println(bstSet.tailSet(9));      //             >= x
        System.out.println(bstSet.subSet(3,9)); //      3 <= list < 9

        TreeSet<Integer> tmp = new TreeSet<Integer>();
        //System.out.println(tmp.first());  // NoSuchElementException
    }
}
