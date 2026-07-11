class Solution {

    static int minOps(int arr[], int k) {
         // Your code here
         int count = 0;
        int maximum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > maximum){
                maximum = arr[i];
            }
        }
        for(int i=0; i<arr.length; i++){
            int j = maximum-arr[i];
            if(j%k!=0){
                return -1;
            }else{
                count+=j/k;
            }
        }
        return count;
    }
}
