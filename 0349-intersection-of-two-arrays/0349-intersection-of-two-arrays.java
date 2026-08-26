class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> map=new HashSet<>();
         HashSet<Integer> ans=new HashSet<>();
        for(int i :nums1){
            map.add(i);
        }
          for(int j :nums2){
           if(map.contains(j)){
            ans.add(j);
           }
        }

        int[] arr=new int[ans.size()];
        int k=0;
        for(int i:ans){
            arr[k++]=i;
        }

        return arr;

    }
}