class Solution {
    public int secondHighest(String s) {
        int start=0;
        int n = s.length();
       

        int firstMax = -1;
        int secondMax = -1;
        while(start < n) {
            int ch = s.charAt(start);
            if(ch >= 48 && ch <= 57){
                ch = ch - '0';
                if(ch > firstMax) {
                    secondMax = firstMax;
                    firstMax = ch;
                } else if(ch > secondMax && ch < firstMax) {
                    secondMax = ch;
                }
            }
            start++;
        }
        
        return secondMax;
    }
}