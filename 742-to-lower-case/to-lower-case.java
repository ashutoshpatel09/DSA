class Solution {
    public String toLowerCase(String s) {
        String sk="";
        for(int i =0;i<s.length();i++){

            char ch = s.charAt(i);
            
            if(ch>='A' && ch<='Z'){
                char ss =(char)(ch+32);  //mene yha pe String st=""+ss kiya tha heheheh
                 sk=sk+ss;
                
            }else{
                sk=sk+ch;
            }
                
            } return sk;
        }
        
    }
