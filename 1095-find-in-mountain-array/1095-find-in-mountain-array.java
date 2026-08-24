/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index);
 *     public int length();
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int length = mountainArr.length();
        
        // 1. Find the peak index safely
        int start = 0;
        int end = length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                start = mid + 1; // We are on the increasing slope
            } else {
                end = mid;       // We are on the decreasing slope or at peak
            }
        }
        int peak = start;

        // 2. Binary search the ascending left side (0 to peak)
        int left = 0;
        int right = peak;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int val = mountainArr.get(mid);
            if (val == target) {
                return mid;
            } else if (val < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // 3. Binary search the descending right side (peak to length - 1)
        left = peak;
        right = length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int val = mountainArr.get(mid);
            if (val == target) {
                return mid;
            } else if (val < target) {
                right = mid - 1; // Inverted because array is descending
            } else {
                left = mid + 1;
            }
        }

        // If target is not found in either half
        return -1;
    }
}