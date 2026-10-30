class Solution {
    void solve(Integer num[], List<List<Integer>> ans,int j){
        if(j==num.length){
            ans.add(new ArrayList<>(Arrays.asList(num)));
            return;
        }
        for(int i=j;i<num.length;i++){
            swap(num,j,i);
            solve(num,ans,j+1);
            swap(num,j,i);
        }

    }
    void swap(Integer num[],int i,int j){
     int temp=num[i];
     num[i]=num[j];
     num[j]=temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        
        Integer num[]=new Integer[nums.length];
        for(int i=0;i<nums.length;i++){
            num[i]=nums[i];
        }
        solve(num,ans,0);
  return ans;
    }
}
