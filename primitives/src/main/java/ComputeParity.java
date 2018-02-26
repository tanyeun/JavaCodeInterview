public class ComputeParity {

    /*
    4.1 Parity Check
          1011  parity is 1 : odd number of 1s
          10001 parity is 0 : even
    */

    public static short parity(long n) {
        n ^= n >>> 32;
        n ^= n >>> 16;
        n ^= n >>> 8;
        n ^= n >>> 4;
        n ^= n >>> 2;
        n ^= n >>> 1;
        return (short)(n & 0x1);
    }

    public static short parity_v2(long n) {
       short result = 0;
       while ( n!= 0 )
       {
           result ^= (n & 1);
           n >>>= 1; // unsigned right shift
       }
       return result;
    }

    public static short parity_v3(long n) {
        short result = 0;
        while ( n!= 0 )
        {
            result ^= 1;  // Every loop will drop one, hence XOR with one
            n &= ( n-1 ); // lowest set bit erased
                          // 1011 => 1010
                          // 1100 => 1000
        }
        return result;
    }
}
