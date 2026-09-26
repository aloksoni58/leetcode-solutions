class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        s = getResult(s);
        t = getResult(t);
        return s.equals(t);
    }

    public String getResult(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch != '#')
                sb.append(ch);
            else 
                if(sb.length() > 0)
                    sb.deleteCharAt(sb.length()-1);
        }

        return sb.toString();
    }
}