class Solution {
    public int[] sortedSquares(int[] nums) {
       int n=nums.length;
       int s=0;
       int l=n-1;
       int ans[]=new int [n];
       int k=n-1;
       while(s<=l){

        int ssq=nums[s]*nums[s];
        int lsq=nums[l]*nums[l];
        if(ssq>lsq){
            ans[k]=ssq;
            s++;
        }
        else{
            ans[k]=lsq;
            l--;
        }
        k--;
       }
       
       return ans;
    }
}