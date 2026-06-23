// Binary Search Implementation in Java
// Description: Standard binary search to find target element in a sorted array.
// Time Complexity: O(log n)
// Space Complexity: O(1)

class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if mid is the target
            if (nums[mid] == target) {
                return mid;
            }
            // If target is greater, ignore left half
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore right half
            else {
                right = mid - 1;  // ✅ fixed: use mid - 1 instead of right - 1
            }
        }

        // Target not found
        return -1;
    }
}
