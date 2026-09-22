class Solution {
    public String convertDateToBinary(String date) {
       String [] arr = date.split("-");
        int year=Integer.parseInt(arr[0]);
        int month =Integer.parseInt(arr[1]);
        int dat=Integer.parseInt(arr[2]);

        String s =Integer.toBinaryString(year)+"-"+Integer.toBinaryString(month)+"-"+Integer.toBinaryString(dat);
        return s;
    }
}