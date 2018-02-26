import java.util.ArrayList;
import java.util.List;

public class LC77 {
    /*
        Combinations:

         Given two integers n and k, return all possible
         combinations of k numbers out of 1 ... n.
     */

    public static List<List<Integer>> combine(int n, int k){
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        helper(1, n, k, ans, result);

        return result;
    }

    private static void helper(int step, int n, int k, List<Integer> ans, List<List<Integer>> res){
        if( ans.size() == k ){
            res.add(new ArrayList<>(ans));
            return;
        }

        for(int i = step; i <= n; i++){
            ans.add(i);
            helper(i+1, n,k,ans,res);
            ans.remove(ans.size()-1);
        }
    }
}
