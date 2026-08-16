class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap<Character, String> hm = new HashMap<>();
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        HashSet<Character> hs1 = new HashSet<>();
        HashSet<String> hs2 = new HashSet<>(Arrays.asList(words));
        for(int i = 0; i < pattern.length(); i++){
            char ch = pattern.charAt(i);
            String word = words[i];
            hs1.add(ch);
            if(hm.containsKey(ch)){
                if(!hm.get(ch).equals(word)) return false;
            }
            else hm.put(ch, word);
        }
        if(hs1.size() != hs2.size()) return false;
        return true;
    }
}