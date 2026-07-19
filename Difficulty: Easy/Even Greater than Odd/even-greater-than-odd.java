

class Solution {
    // Method to rearrange the array
    public ArrayList<Integer> rearrangeArray(ArrayList<Integer> arr) {
        // code here
        int n = arr.size();
        for (int i = 1; i < n; i++) {
            if ((i + 1) % 2 == 0) {
                if (arr.get(i) < arr.get(i - 1)) {
                    Collections.swap(arr, i, i - 1);
                }
            }
            else{
                if (arr.get(i) > arr.get(i - 1)) {
                    Collections.swap(arr, i, i - 1);
                }
            }
        }
        return arr;
    }
}
