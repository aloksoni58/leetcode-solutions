class Solution {
    public boolean backspaceCompare(String s, String t) {
        s = getSimpleString(s);
        t = getSimpleString(t);
        return s.equals(t);
    }

    public String getSimpleString(String s) {
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