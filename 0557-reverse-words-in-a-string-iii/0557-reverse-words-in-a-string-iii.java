class Solution {
    public String reverseWords(String s) {
        
        String[] list = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < list.length; i++) {
            StringBuilder temp = new StringBuilder(list[i]);
            sb.append(temp.reverse());
            if(i != list.length-1)
                sb.append(" ");
        }
        return sb.toString();
    }
}