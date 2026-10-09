class Solution {
    public String decodeString(String s) {
        
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        int num = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch)) {
                num = num * 10 + (ch-'0');
            } else if(ch == '[') {
                numStack.push(num);
                stringStack.push(sb);
                num = 0;
                sb = new StringBuilder();
            } else if(Character.isLetter(ch)) {
                sb.append(ch);
            } else if(ch == ']') {
                int count = numStack.pop();
                StringBuilder temp = sb;
                sb = stringStack.pop();
                for(int j = 1; j <= count; j++) 
                    sb.append(temp);
            }
       }

       return sb.toString();
    }
}