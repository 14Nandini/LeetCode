class Solution {
    public int minAddToMakeValid(String s) {
        int add = 0, open = 0;
        for(char ch : s.toCharArray()){
            if(ch == '(') open++;
            else{
                if(open > 0) open--;
                else add++;
            }
        }
        return open + add;
    }
}