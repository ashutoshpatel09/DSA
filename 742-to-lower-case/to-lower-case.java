class Solution {
    public String toLowerCase(String s) {
        String sk="";
        for(int i =0;i<s.length();i++){

            char ch = s.charAt(i);
            
            if(ch>='A' && ch<='Z'){
                char ss =(char)(ch+32);
                String st=""+ss;
                sk=sk+st;
                
            }else{
                sk=sk+ch;
            }
                
            } return sk;
        }
        
    }
