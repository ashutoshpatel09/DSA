class Solution {
    public int scoreOfString(String s) {
        int sum =0;
        int j =1;
        int i =j-1;
        
        
        while(i<s.length()-1 || j<s.length()){
            int sub =Math.abs(s.charAt(j)-s.charAt(i));
            sum=sub+sum;
            i++;
            j++;
        }return sum;
        
    }
}