class Solution {
    public int minAddToMakeValid(String s) {
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(')
                sb.append(ch);
            else 
                if(sb.isEmpty()) {
                    sb.append(ch);
                } else if(sb.charAt(sb.length()-1) == '(') {
                    sb.deleteCharAt(sb.length()-1);
                } else {
                    sb.append(ch);
                }
        }

        return sb.length();
    }
}