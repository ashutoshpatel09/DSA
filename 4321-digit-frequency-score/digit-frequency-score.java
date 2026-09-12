class Solution {
    public int digitFrequencyScore(int num) {
        int sum=0;
        while(num!=0){
            int digit=num%10;
            sum=sum+digit;
            num=num/10;
        }return sum;
        
    }
}