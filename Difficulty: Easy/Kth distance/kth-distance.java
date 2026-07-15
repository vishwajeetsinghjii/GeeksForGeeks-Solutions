class Solution {
    public boolean checkDuplicatesWithinK(int[] arr, int k) {
        // your code
        // for(int i=0; i<arr.length; i++){
        //     for(int c=1; c<=k && (i+c)<arr.length; c++){
        //         int j = i+c;
        //         if(arr[i] == arr[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            if(set.contains(arr[i])){
                return true;
            }
            set.add(arr[i]);
            if(i>=k){
                set.remove(arr[i-k]);
            }
        }
        return false;
        
        
        
    }
}