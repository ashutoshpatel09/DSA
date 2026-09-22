class Solution {
    public String reversePrefix(String word, char ch) {
        int index=-1;
        for(int i =0;i<word.length();i++){
            if(word.charAt(i)==ch){
                index=i;
                break;
            }
        }
        String rev = "";

for(int i = index; i >= 0; i--) {
    rev = rev + word.charAt(i);
}
String remaining = word.substring(index + 1);
return rev+remaining;
    }
}