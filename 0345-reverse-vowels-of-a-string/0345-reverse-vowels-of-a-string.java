class Solution {
    public String reverseVowels(String s) {
        
        StringBuilder sb = new StringBuilder(s);
        int start = 0;
        int end = sb.length()-1;

        while(start < end) {
            char sc = sb.charAt(start);
            char ec = sb.charAt(end);
            if(sc != 'a' && sc != 'e' && sc != 'i' && sc != 'o' && sc != 'u' && sc != 'A' && sc != 'E' && sc != 'I' && sc != 'O' && sc != 'U' ) 
                start++;
            else if(ec != 'a' && ec != 'e' && ec != 'i' && ec != 'o' && ec != 'u' && ec != 'A' && ec != 'E' && ec != 'I' && ec != 'O' && ec != 'U')
                end--;
            else {
                sb.setCharAt(start, ec);
                sb.setCharAt(end, sc);
                start++;
                end--;
            }
        }

        return sb.toString();
    }
}