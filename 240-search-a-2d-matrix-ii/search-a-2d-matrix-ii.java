class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int  n = arr.length;
        int str =0; int end =n-1;
        for(int i =0;i<n;i++){
            for(int j =0;j<arr[0].length;j++){
                if (target>arr[i][j]) str++;
                else if ( target<arr[i][j] ) end--;
                else{
                    return true;
                }
                   
                }
            } return false;
        }
        
    }
