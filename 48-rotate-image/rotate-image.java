class Solution {
    public void rotate(int[][] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j =0;j<i;j++){
                int temp =arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
       //reverse ka ccode
       int  n =arr.length;
       for (int i =0;i<n;i++){
        int fc=0;
        int lc=arr[0].length-1;
        while(fc<lc){
            int temp=arr[i][fc];
            arr[i][fc]=arr[i][lc];
            arr[i][lc]=temp;
            fc++;
            lc--;
        }
       }
        
    }
}