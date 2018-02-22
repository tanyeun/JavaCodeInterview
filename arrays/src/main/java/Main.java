import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Array");
        //             0 1 2 3 4 5 6
        int[] ary1d = {1,2,3,4,5,6,9};
        int[][] ary2d = { {1,2,3},
                          {4,5,6},
                          {7,8,9}};

        // If found, return index, otherwise -(length+1)
        System.out.println(ary1d.length);
        System.out.println(Arrays.binarySearch(ary1d, 5));
        System.out.println(Arrays.binarySearch(ary1d, 12));
        System.out.println(Arrays.binarySearch(ary1d, 9));
        print2D(ary2d);

        int[] aryRand = {15, 2, 3, 7, 9, 57};
        Integer[] aryRand2 = {15, 2, 3, 7, 9, 57};
        int[] ary1dCp = Arrays.copyOf(ary1d, 3); // copy ary1d of length 3
        int[] ary1dCp2 = Arrays.copyOfRange(ary1d, 2, 5); // from index 2 to 4
        // y. System.arraycopy(來源陣列，起始索引值，目的陣列，起始索引值，複製長度);
        System.out.println(Arrays.toString(ary1dCp));
        System.out.println(Arrays.toString(ary1dCp2));
        Arrays.sort(aryRand); // This implements quick sort
        System.out.println(Arrays.toString(aryRand));
        Arrays.sort(aryRand2, Collections.reverseOrder()); // Doesn't work on
                                                           // primitive types
        System.out.println(Arrays.toString(aryRand2));

        List<Integer> aryList = Arrays.asList(1, 2, 6);
        List<Integer> aryList2 = new ArrayList<>();
        aryList2.add(1);
        aryList2.add(2);
        aryList2.add(6);
        System.out.println(aryList.toString()); // can't add/remove elements to
        // Arrays.asList objects, because it's partially mutable
        System.out.println(aryList2.toString());
        System.out.println(aryList.equals(aryList2));
        aryList2.add(9);
        System.out.println(aryList2.toString());

        System.out.println();
    }

    static void print2D(int[][] matrix)
    {
        // matrix[x][y]
        System.out.println("[");
        for(int i=0; i < matrix.length; i++)
        {
            System.out.println("  " + Arrays.toString(matrix[i]));
        }
        System.out.println("]");
    }
}
