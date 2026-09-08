class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        int n = strs.length;
        if(n == 1) return strs[0];
        StringBuilder res = new StringBuilder();
        Arrays.sort(strs);
        char[] first = strs[0].toCharArray();
        char[] last = strs[n - 1].toCharArray();
        int minLength = Math.min(first.length, last.length);
        for(int i = 0; i < minLength; i++){
            if(first[i] != last[i]) break;
            res.append(first[i]);
        }
        return res.toString();
    }
}