class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int glen = g.length, slen = s.length;
        int i = 0, j = 0, c = 0;
        while(i < glen && j < slen){
            if(s[j] >= g[i]){
                c++;
                i++;
                j++;
            }
            else if(s[j] < g[i]) j++;
        }
        return c;
    }
}