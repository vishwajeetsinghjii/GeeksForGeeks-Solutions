class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans.add(arr[0]);
        for(int i=1; i<arr.length; i++){
            if(arr[i-1] != arr[i]){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}
