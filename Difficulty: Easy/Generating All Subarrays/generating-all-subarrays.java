class Solution {
    public List<List<Integer>> getSubArrays(int[] arr) {
        // code here
        List<Integer> subArr = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                subArr.add(arr[j]);
                ans.add(new ArrayList<>(subArr));
            }
            subArr.clear();
        }
        
        return ans;
    }
}