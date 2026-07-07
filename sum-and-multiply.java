// Problem: Sum and Multiply
// Topic: Math
// Approach:
// 1. Calculate the sum of all digits.
// 2. Create a new number by removing all zero digits.
// 3. Return (newNumber × sumOfDigits).
//
// Time Complexity: O(d)
// Space Complexity: O(1)

class Solution {
    public long sumAndMultiply(int n) {
        int p = 1;
        int numberWithoutZeros = 0;
        int digitSum = 0;

        while (n > 0) {
            int digit = n % 10;

            digitSum += digit;

            if (digit != 0) {
                numberWithoutZeros += p * digit;
                p *= 10;
            }

            n /= 10;
        }

        return 1L * numberWithoutZeros * digitSum;
    }
}
