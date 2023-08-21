package Problems;
import java.util.ArrayList;
import java.util.List;

public class Problem89 {
    
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
       helper(candidates,candidates.length,0,target,res); 
        return ans;
    }
    
    public void helper(int[] candidates,int n,int sum,int target,List<Integer> res){
        if(sum == target){
            ans.add(new ArrayList<>(res));
            return;
        }
        if(n==0)
            return;
        
        if(sum+candidates[n-1]<=target){
            res.add(candidates[n-1]);
            helper(candidates,n,sum+candidates[n-1],target,res);
            res.remove(res.size()-1);
             helper(candidates,n-1,sum,target,res);
        }else{
             helper(candidates,n-1,sum,target,res);
        }
        
    }

    public static void main(String[] args){
        Problem89 pb = new Problem89();
        int num[] = {2,3,6,7};
        List<List<Integer>> ans = pb.combinationSum(num,7);
        System.out.println(ans);
    }
    
}
