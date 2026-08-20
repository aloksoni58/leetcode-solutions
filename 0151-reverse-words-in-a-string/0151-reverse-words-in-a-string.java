class Solution {

    public String normalizeSpace(String s) {
        String res = "";
        boolean lastWasSpace = true;//skip leading zeros
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == ' ') {
                if(!lastWasSpace) {
                    res += ' ';
                }
                lastWasSpace = true;
            } else {
                res += c;
                lastWasSpace = false;
            }
        }
        //skip trailing space
        if(res.length() > 0 && res.charAt(res.length()-1) == ' ') {
            res = res.substring(0, res.length()-1);
        }
        return res;
    }
    public String reverseWords(String s) {
        // s = s.trim().replaceAll(" +", " ");
        s = normalizeSpace(s);
        int i = s.length()-1;
        int j = i;
        int k;
        String res = "";
        while(i >= 0) {
            if(s.charAt(i) == ' ' || i == 0) { 
                k = i == 0? i : i+1;
                while(k <= j) {
                    res += s.charAt(k);
                    k++;
                }
                if(i != 0) {
                    res += ' ';
                }
                j = i-1;
            }
            i--;
        }
        return res;
    }
}