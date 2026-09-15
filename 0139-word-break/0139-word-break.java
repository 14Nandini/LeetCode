class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> hs = new HashSet<>(wordDict);
        int maxLen = 0;
        for(String str : hs){
            if(str.length() > maxLen) maxLen = str.length();
        }
        int n = s.length();
        boolean[] res = new boolean[n + 1];
        res[0] = true;
        for(int i = 1; i <= n; i++){
            for(int j = i - 1; j >= Math.max(0, i - maxLen); j--){
                if(res[j] && hs.contains(s.substring(j, i))){
                    res[i] = true;
                    break;
                }
            }
        }
        return res[n];
    }
}