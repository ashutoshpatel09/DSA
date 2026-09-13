class Solution {
    public int minimumOperations(int[] nums) {

        int count=0;
        int k =nums.length;
        for(int i =0;i<k;i++){
            if (nums[i]%3==1){
                nums[i]-=1;
                count++;
            }else if( nums[i]%3==2){
                nums[i]+=1;
                count++;
            }
        }return count;
    }
}