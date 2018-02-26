import java.util.List;

public class AdvanceThroughArray {

    /*
       5.4 Advancing through an array

           Given a sequence of numbers, the number indicates the max step
           it can proceed from it's position, i.e. at index i, the furthest
           index it can reach is i+Array[i]
                0 1 2 3 4 5 6
           eg: [2,4,1,1,0,2,3] The success step is : 0 => 1 => 5 => END
                               The failure steps is : 0 => 2 => 3 => 0 STUCK
    */

    public static boolean arrayAdvance(List<Integer> A) {
        int steps = 0, count = 0, length = A.size() - 1;
        while (steps >= 0) {
            //UPDATE TOTAL NUMBER OF STEPS IF GREATER THAN STORED
            if (A.get(count) > steps) {
                steps = A.get(count);
            }
            steps--;
            count++;

            //IF YOU CAN REACH THE LAST INDEX THEN RETURN TRUE
            if (count + steps >= length)
                return true;
        }
        return false;
    }

    public static boolean arrayAdvance_v2(List<Integer> A) {
        // Given one head pointer to move from the left end
        int head = 0, lastIndex = A.size() - 1;
        // i <= head : make sure you can reach i since head is the max range
        // head < lastIndex make sure we didn't reach end yet, if reach end, break
        for(int i = 0; i <= head && head < lastIndex; ++i){
            head = Math.max(head, i+A.get(i));
        }
        return head >= lastIndex;
    }
}
