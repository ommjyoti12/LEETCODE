class Solution {
    public int majorityElement(int[] nums) {
        int ans=0;
        int fq=0;
        for(int i=0;i<nums.length;i++){
            if(fq==0){
                fq=1;
             ans=nums[i];
            }
        else  if(nums[i]==ans){
                fq++;
            }else{
                fq--;
            }
        }
        return ans;
    }
}