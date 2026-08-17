class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
        int ans=-1;
       int f=1;
       int l=x;
       while(f<=l){
        int mid=f+(l-f)/2;
        if((long)mid*mid<=x){

    ans=mid;
    f=mid+1;
   
        }
        else{
            l=mid-1;
            
        }
       }
       return ans;
    }
}