import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Primitives");

        System.out.println(Integer.SIZE); // 32 Bits, 4 bytes
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.SIZE);   // 32 Bits, 4 bytes
        System.out.println(Double.SIZE);  // 64 Bits, 8 bytes
        System.out.println(Boolean.TRUE);

        System.out.println(Double.valueOf("1.23"));   // String to double
        System.out.println(Double.toString(3.14)); // Double to String
        System.out.println(Integer.valueOf("65"));    // Or Integer.parseInt("65")

        System.out.println(Integer.toString(6));   // int to string
        System.out.println(String.valueOf(123));

        System.out.println(Boolean.valueOf("true"));  // String to boolean
                                                      // Or Boolean.value(true)

        System.out.println(Double.compare(1.2, 3.4) == 0);
        System.out.println(Integer.compare(2, 2) == 0);

        System.out.println(Math.abs(-15));
        System.out.println(Math.ceil(2.18));
        System.out.println(Math.floor(2.18));
        System.out.println(Math.pow(2, 3));    // 2 to the power of 3, 2^3
        System.out.println(Math.sqrt(225));

        char[] c = {'a', 'b'};
        System.out.println(c);

        // A few ways to convert char to integer
        char x = 'a';
        System.out.println(x-'0');
        System.out.println((int) x);
        System.out.println(Character.getNumericValue(x));

        int y = 11; // 1011
        System.out.println(y>>>1);

    }
}