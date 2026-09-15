class Solution {
    public boolean backspaceCompare(String s, String t) {
        String s1 = "", t1 = "";
        int cnt = 0;
        for(int i = s.length()-1; i >= 0; i--){
            char ch = s.charAt(i);
            if(ch == '#') cnt++;
            else{
                if(cnt > 0){
                    cnt--;
                    continue;
                } 
                s1 = ch + s1;
            }
        }
        cnt = 0;
        for(int i = t.length()-1; i >= 0; i--){
            char ch = t.charAt(i);
            if(ch == '#') cnt++;
            else{
                if(cnt > 0){
                    cnt--;
                    continue;
                } 
                t1 = ch + t1;
            }
        }
        return s1.equals(t1);
    }
}