class Solution {
    public int mySqrt(int x) {
        if(x<2) return x;
        int ans=0;
        int high=x/2;
        int low=1;
        while(low<=high){
            int mid=(low+high)/2;
            if(mid<=x/mid){
                ans=mid;
                low=mid+1;

            }else if( mid>=x/mid){
                high=mid-1;
            }
        }return ans;
        
    }
}