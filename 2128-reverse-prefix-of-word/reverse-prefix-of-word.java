class Solution {
    public String reversePrefix(String word, char ch) {
        if(!word.contains(String.valueOf(ch))) return word;
        StringBuilder sb = new StringBuilder();
        int i;
        for( i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            sb.append(c);
            if(c == ch) break;
            
        }
        sb.reverse();
        sb.append(word.substring(i+1));
        return sb.toString();
    }
}