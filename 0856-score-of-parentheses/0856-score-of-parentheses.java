class Solution {
    public int scoreOfParentheses(String s) {
        int d = 0, res = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(') ++d;
            else{
                --d;
                if(s.charAt(i-1) == '(') res += 1 << d;
            }
        }
        return res;
    }
}