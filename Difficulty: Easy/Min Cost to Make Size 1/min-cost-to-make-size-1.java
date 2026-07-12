class Solution {
    public int cost(int[] arr) {
        // code here
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min*(n-1);
    }
}