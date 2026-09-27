class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch) && !st.isEmpty()) st.pop();
            else st.push(ch);
        }
        while(!st.isEmpty()) sb.append(st.pop());
        return sb.reverse().toString();
    }
}