import java.util.ArrayList;
import java.util.List;
/*
Requirements:
 Define a class to represent an interval of integers and operations on them.
 The interval is defined as closed on the left, open on the right, e.g.
 Interval(6,8) represents the interval [6,8), which is the set {6,7}.

Implement the following methods for this class:

length(): return the length of the interval
contains(a): return true if the argument "a" is an integer in the interval.
intersects(r): return true if the argument "r" is an interval that intersects this interval,
        i.e., true if the intervals have any values in common
*/

public class Interval {
    int start;
    int end;
    Interval(){start = 0; end = 0;}
    Interval(int s, int e){start = s; end = e;}

    public static List<Interval> fromArray(int[][] ary){
        List<Interval> result = new ArrayList<>();
        for(int i = 0; i < ary.length; i++){
            Interval e = new Interval(ary[i][0], ary[i][1]);
            result.add(e);
        }
        return result;
    }

    public static boolean equals(Interval a, Interval b){
        if( a.start == b.start &&
            a.end == b.end )
            return true;
        else
            return false;
    }

    public String toString() {
        StringBuilder list = new StringBuilder();
        list.append("[ "+this.start+", "+this.end+" ]");
        return list.toString();
    }

    // Say Range(-1, MAXINT)
    // end - start will be MAXINT+1 => BANG!!
    public int length() throws Exception {
        if ( ( this.end - this.start ) < 0 )
            throw new Exception("Overflow");

        return (this.end - this.start);
    }

    boolean contains(int number){
        if( number < this.start || number > this.end ){
            return false;
        } else
            return true;
    }

    boolean intersects( Interval rr){
        int start = rr.start;
        int end = rr.end;

        if( start < this.start ){
            if( end > this.start && end <= this.end )
                return true;
            else
                return false;
        } else if ( start >= this.start && start <= this.end)
            return true;
        else
            return false;
    }
}
