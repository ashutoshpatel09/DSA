class Solution {
    public int finalValueAfterOperations(String[] op) {
        int n = op.length;
        int x =0;
        for(int i =0;i<n;i++){
            String current =op[i];
            if(current.equals("++X") || current.equals("X++")){
                x++;
            }else{
                x--;
            }
        }return x;
        
    }
}