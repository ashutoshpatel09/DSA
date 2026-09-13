class Solution {
    public int minimumOperations(int[] nums) {

        int count=0;
        int k =nums.length;
        for(int i =0;i<k;i++){
            if (nums[i]%3!=0){
                count++;
            }
        }return count;
    }
}