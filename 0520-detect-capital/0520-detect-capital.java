class Solution {
    public boolean detectCapitalUse(String word) {
        
        int countCapital = 0;
        for(int i = 0; i < word.length(); i++) {
            if(Character.isUpperCase(word.charAt(i))) {
                countCapital++;
            }
        }

        if(countCapital == 0) {
            return true;
        }
        if(countCapital == word.length()) {
            return true;
        }
        if(countCapital == 1 && Character.isUpperCase(word.charAt(0))) {
            return true;
        }
        return false;

    }
}