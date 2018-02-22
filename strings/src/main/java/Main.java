import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello String");

        //            0123456789..............25...
        String str = "needle, in the hay, 99, hello world!!!, this is our world";
        String a = "foo";

        System.out.println(str.charAt(3));
        System.out.println(a.compareTo("foo"));  // equal, return zero
        System.out.println(a.compareTo("jack")); // Not equal, return non-zero
        System.out.println(a.equals("foo"));
        System.out.println(a.equals("bar"));
        System.out.println(a.concat(" bar"));
        System.out.println(a);                // Invoke concat on a doesn't change a
        System.out.println(str.contains("hello"));
        System.out.println(str.indexOf('9')); // The first index of '9'
        System.out.println(str.indexOf('e')); // The first index of 'e'
        System.out.println(str.lastIndexOf('e')); // The last index
        String[] parts = str.split(",");
        System.out.println(Arrays.toString(parts));
        System.out.println(str.startsWith("needle"));
        System.out.println(str.replace('e', 'E'));
        System.out.println(str.replaceAll("world", "Java"));

        char[] ch = a.toCharArray();
        System.out.println(ch);

        System.out.println(str.substring(3));         // from index 3 to END
        System.out.println(str.substring(2, 9)); // from index 2 to 8

        StringBuilder b = new StringBuilder("hello");
        System.out.println(b);
        b.append(" world!");
        System.out.println(b); // Invoke method on StringBuilder changes itself
    }
}
