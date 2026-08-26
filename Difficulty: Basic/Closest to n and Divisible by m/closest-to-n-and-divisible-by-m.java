class Solution {
    static int closestNumber(int n, int m) {
        int q = n / m;

        int value1 = q * m;
        int value2;

        if ((n < 0) == (m < 0)) {
            value2 = (q + 1) * m;
        } else {
            value2 = (q - 1) * m;
        }

        int diff1 = Math.abs(n - value1);
        int diff2 = Math.abs(n - value2);

        if (diff1 < diff2) {
            return value1;
        } else if (diff2 < diff1) {
            return value2;
        } else {
            // Equal distance → maximum absolute value
            return Math.abs(value1) > Math.abs(value2) ? value1 : value2;
        }
    }
}