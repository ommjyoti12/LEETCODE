class Solution {
      void solve(List<List<Integer>> ans,List<Integer> list,int[] nums,int i){


        if(i==nums.length){
          ans.add(new ArrayList<>(list));
          return;
        }
        list.add(nums[i]);
        solve(ans,list,nums,i+1);
        list.remove(list.size()-1);

        solve(ans,list,nums,i+1);
      }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>  ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();

        solve(ans,list,nums,0);
        return ans;
    }
}