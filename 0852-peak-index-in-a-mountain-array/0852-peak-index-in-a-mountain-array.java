class Solution {
    public int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // Find the middle element (prevents potential integer overflow)
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid+1]  && arr[mid-1]<arr[mid]) {
                return mid; // Target lies in the left half
            } else if (arr[mid] <arr[mid+1] ) {
                start = mid + 1; // Target lies in the right half
            } else if(arr[mid] >arr[mid+1]){
                end=mid-1; // Target found at index mid
            }
        }

        return -1;
        
    }
}