class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] scnt = new int[26];
        int[] pcnt = new int[26];
        List<Integer> res = new ArrayList<>();
        for(char ch : p.toCharArray()){
            pcnt[ch - 'a']++;
        }
        for(int i = 0; i < s.length(); i++){
            scnt[s.charAt(i) - 'a']++;
            if(i >= p.length()) scnt[s.charAt(i - p.length()) - 'a']--;
            if(Arrays.equals(pcnt, scnt)) 
                res.add(i - p.length() + 1);
        }
        return res;
    }
}