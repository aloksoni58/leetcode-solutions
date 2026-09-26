class Solution {
    public String makeGood(String s) {
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(sb.isEmpty()) {
                sb.append(ch);
            } else if(Character.toUpperCase(ch) == Character.toUpperCase(sb.charAt(sb.length()-1)) &&
                      Character.isUpperCase(ch) != Character.isUpperCase(sb.charAt(sb.length()-1))
            ) { 
                sb.deleteCharAt(sb.length()-1);
            } else {
               sb.append(ch); 
            }
        }

        return sb.toString();
    }
}