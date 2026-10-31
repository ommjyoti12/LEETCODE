class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer> st=new ArrayList<>();
        getelement(arr,  target,0,ans,st);
        return ans;

    }
       public void getelement(int[] arr, int target,int index,List<List<Integer>>ans,List<Integer>st) {

        if(index==arr.length){
            return;
        }
        if(target<0){
            return;
        }
        if(target==0){
            ans.add(new ArrayList<>(st));
            return;

        }
        st.add(arr[index]);
     
      getelement(arr, target-arr[index],index,ans,st);
     st.remove(st.size()-1);
       getelement(arr, target,index+1,ans,st);
       }
    
}