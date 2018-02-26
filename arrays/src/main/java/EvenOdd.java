public class EvenOdd {
    public static void evenOdd(int[] A){
        int nextEven = 0, nextOdd = A.length - 1;
        while( nextEven < nextOdd ){
            if( A[nextEven] % 2 == 0 ){
                nextEven++; // Only advance when nextEven points to even
                            // Which ensure the even zone on the left
            }else{
                int temp = A[nextEven];    // In this block, we know nextEven points to an odd
                A[nextEven] = A[nextOdd];  // swap makes nextOdd points to an odd
                A[nextOdd--] = temp;       // nextOdd-- makes sure on the right of nextOdd pointer
                                           // is the odd zone
            }
        }
    }
}
