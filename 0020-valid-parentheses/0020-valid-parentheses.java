class Solution {
    public boolean isValid(String s) {
        

        int n = s.length();
        if(s.length() == 0) 
            return false;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') {
                sb.append(ch);
            } else {
                if(sb.isEmpty()) {
                    return false;
                }
                if((sb.charAt(sb.length()-1) == '(' && ch == ')') ||
                    (sb.charAt(sb.length()-1) == '{' && ch == '}') ||
                    (sb.charAt(sb.length()-1) == '[' && ch == ']')
                ) {
                    sb.deleteCharAt(sb.length()-1);
                } else {
                    return false;
                }
            }   
        }

        if(sb.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }
}