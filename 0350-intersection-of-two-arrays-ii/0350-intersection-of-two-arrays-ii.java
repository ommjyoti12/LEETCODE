class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> hs = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int num : nums1) {
            hs.put(num, hs.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            if (hs.getOrDefault(num, 0) > 0) {
                ans.add(num);
                hs.put(num, hs.get(num) - 1);
            }
        }

        int[] arr = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i);
        }

        return arr;
    }
}