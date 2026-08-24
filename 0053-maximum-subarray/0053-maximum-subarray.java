class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int zx=Integer.MIN_VALUE;
      for(int i=0;i<nums.length;i++){
        sum+=nums[i];
       zx= Math.max(zx,sum);

    if(sum<0){
        sum=0;
    }
      }

        
     return zx;
    }
    
}