class Solution {
    public int findMin(int[] nums){

        int start=0;
        int a=-1;
        
        int end=nums.length-1;
//	        int mid = start + (end - start) /2;

        while(start<=end){
            int mid = start + (end - start) /2;
            
            if(nums[0]<=nums[end]){
                a=nums[0];
                break;
            }
            if(mid<end && nums[mid]>nums[mid+1]){
                a=nums[mid+1];
                break;
                
            }
            if(mid<end && nums[mid]>nums[0] && nums[mid]<nums[mid+1]){
                start=mid+1;
            }
            if(mid>start && nums[mid]<nums[mid-1]){
                a=nums[mid];
                break;
                
            }
            if(nums[mid]<nums[0]){
                end=mid-1;
            }
            
        }
        return a;

    }
}