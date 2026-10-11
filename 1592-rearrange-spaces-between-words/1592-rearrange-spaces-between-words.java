class Solution {
    public String reorderSpaces(String text) {
        
        if(text.length() == 0 || text.length() == 1) {
            return text;
        }
        int spaces = 0;
        for(int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if(ch == ' ')
                spaces++;
        }
        List<String> list = stringToListOfWords(text);
        int divSpace = 0;
        int extraSpace = 0;
        if(list.size() == 1) {
            divSpace = 0;
            extraSpace = spaces; 
        } else {
            divSpace = spaces/(list.size()-1);
            extraSpace = spaces%(list.size()-1);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if(i < list.size()-1) {
                for(int j = 0; j < divSpace; j++)
                    sb.append(" ");
            }
        }
        while(extraSpace-- > 0) {
            sb.append(" ");
        }

        return sb.toString();


    }

    public List<String> stringToListOfWords(String s) {
        List<String> list = new ArrayList<String>();
        StringBuilder word = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isAlphabetic(ch)) {
                word.append(ch);
                if(i == s.length()-1) {
                    list.add(word.toString());
                    word = new StringBuilder();
                }
            } else {
                if(!word.isEmpty()) {
                    list.add(word.toString());
                    word.setLength(0);
                }
            }
        }
        return list;
    }
}