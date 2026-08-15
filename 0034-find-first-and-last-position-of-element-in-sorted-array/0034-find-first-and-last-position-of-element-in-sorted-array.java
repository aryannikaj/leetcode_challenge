class Solution {
    public int[] searchRange(int[] nums, int target) {
		
        int start = 0;
        int end = nums.length - 1;
        int index_1=-1;
        int index_2=-1;

        // If target is greater than the largest element
        

        while (start <= end) {
           int mid = start + (end - start) / 2;
            if(target==nums[mid]) {

	           index_1=mid;
	           end=mid-1;
	             
	              }
            if(nums[mid]<target) {
            	start=mid+1;
            }
            if(target<nums[mid]) {
           	 end=mid-1;
            }
            
            
        }
        
        
        start = 0;
        end = nums.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
             if(target==nums[mid]) {

 	           index_2=mid;
 	           start=mid+1;
 	             
 	              }
             if(nums[mid]<target) {
            	 start=mid+1;
             }
             if(target<nums[mid]) {
            	 end=mid-1;
             }
             
         }
        
        
        return new int[] {index_1,index_2} ;
//       
	}
}