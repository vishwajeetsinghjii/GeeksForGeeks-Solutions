class Solution {
    public static boolean isPalinArray(int[] arr) {
        // code here.
        for(int i=0; i<arr.length; i++){
            int n = arr[i];
            int reversed = 0;
            while(n>0){
                int lastDigit = n%10;
                reversed = reversed*10 + lastDigit;
                n/=10;
            }
            if(reversed!=arr[i]){
                return false;
            }
        }
        return true;
    }
}

/*Palindrome can be checked either by reversing the digit and compare it with the original one 
or checking the first digit with the last digit of that number*/