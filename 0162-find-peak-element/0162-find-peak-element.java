class Solution {
    
    public int findPeakElement(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            // Find the middle element (prevents potential integer overflow)
            int mid = start + (end - start) / 2;
            if(mid==0 && start==end) {
            	return mid;
            }
            else if(mid==0 && nums[mid]>nums[mid+1]) {
            	return mid;
            }
            else if(mid==0 && nums[mid]<nums[mid+1]) {
            	return mid+1;
            }

            if (mid==nums.length-1 || nums[mid] > nums[mid+1]  && nums[mid-1]<nums[mid]) {
                return mid; // Target lies in the left half
            } else if (nums[mid] <nums[mid+1] ) {
                start = mid + 1; // Target lies in the right half
            } else if(nums[mid] >nums[mid+1]){
                end=mid-1; // Target found at index mid
            }
        }

        return -1;
        
    }
}