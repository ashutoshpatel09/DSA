class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
         List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int m =arr[0].length;
        int fr=0; 
        int fc=0;
        int lr=n-1;
        int lc=m-1;
        int tne=m*n;
        while(tne>ans.size()){
            for(int j =fc;j<=lc;j++){
                ans.add(arr[fr][j]);
            }
                fr++;
                if(ans.size()==tne) break;
            
             for(int i=fr;i<=lr;i++){
                ans.add(arr[i][lc]);
             }
                lc--;
                if(ans.size()==tne) break;

             
              for(int j =lc;j>=fc;j--){
                ans.add(arr[lr][j]);
              }
                lr--;
                if(ans.size()==tne) break;
              
              for(int i=lr;i>=fr;i--){
                ans.add(arr[i][fc]);
              }
                fc++;
                if(ans.size()==tne) break;

             
              

        }return ans;
        
    }
}