class Solution {
    public boolean detectCapitalUse(String word) {
        int c = 0;
        for(char ch : word.toCharArray()){
            if(Character.isUpperCase(ch)) c++;
        }
        if(c == 0 || c == word.length()) return true;
        if(c == 1 && Character.isUpperCase(word.charAt(0))) return true;
        return false;   
    }
}