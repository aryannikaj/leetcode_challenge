

class Solution{
public void duplicateZeros(int[] arr) {
    // Duplicate Zeros: implement this function.

    // int i=0;
    if(arr.length==1){
        return;
    }
    for(int j=0;j<arr.length;j++){
        if(arr[j]==0 && j!=arr.length-1){
            // int temp=nums[j+1];
            // nums[j+1]=0;
            for(int k=arr.length-1;k>j;k--){
                // int len=nums.length-1;
                // int temp=nums[len];
                arr[k]=arr[k-1];
            }

            j++;


        }

    }
    
}
}