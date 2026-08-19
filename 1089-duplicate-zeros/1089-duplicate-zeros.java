class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int i = 0;
        int k = 0;

        int[] temp = new int[n];

        while (i < n && k < n) {

            if (arr[i] == 0) {
                temp[k++] = 0;

                if (k < n) {
                    temp[k++] = 0;
                }
            } 
            else {
                temp[k++] = arr[i];
            }

            i++;
        }

        // Copy temp back to arr
        for (int j = 0; j < n; j++) {
            arr[j] = temp[j];
        }
    }
}