public class Basics {
    // Basic operations regarding primitive types
    public static int arrayFindInt(int[] ary, int target){
        for(int i = 0; i < ary.length; i++ ){
            if( ary[i] == target )
                return i;
        }
        return -1;
    }
}
