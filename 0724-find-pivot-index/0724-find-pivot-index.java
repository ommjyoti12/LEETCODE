class Solution {
    public int pivotIndex(int[] nums) {
        int sum1=0;
        for(int i=0;i<nums.length;i++){
       sum1+=nums[i];
           }
        int sum2=0;
    for(int i=0;i<nums.length;i++){
         sum2+=nums[i];
         if((sum2-nums[i])==(sum1-sum2)){
            return i;
         }
        }


        return -1;

    }
}