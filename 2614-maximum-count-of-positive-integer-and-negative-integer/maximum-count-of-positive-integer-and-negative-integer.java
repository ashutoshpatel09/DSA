class Solution {
    public int maximumCount(int[] arr) {
        int n =arr.length;
       int low =0;
       int high =n-1;
       while(low<=high){
       int mid=low+(high-low)/2;
       //finding negcount
       if(arr[mid]>=0){
        high=mid-1;
       }else{
        low=mid+1;
       }
    }
    int negcount = low;
    
        low =0;
        high =n-1;
       while(low<=high){
       int mid=low+(high-low)/2;
       //finding poscount
       if(arr[mid]>0){
        high=mid-1;
       }else{
        low=mid+1;
       }
       }
       int poscount= n-low;
        return Math.max(negcount, poscount);
    }

    }