class Solution {
    public int differenceOfSums(int n, int m) {
        int asum=0;
        int bsum=0;
        for(int i=1;i<=n;i++){
            if(i%m==0){
                asum=asum+i;
            }else if(i%m!=0){
                bsum=bsum+i;
        }
        
    }return bsum-asum;
}
}