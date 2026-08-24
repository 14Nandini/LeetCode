class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < tokens.length; i++){
            String ch = tokens[i];
            if(ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")) { 
                int ch1 = st.pop();
                int ch2 = st.pop();
                if(ch.equals("+")) st.push(ch1 + ch2); 
                else if(ch.equals("-")) st.push(ch2 - ch1);
                else if(ch.equals("*")) st.push(ch1 * ch2);
                else if (ch.equals("/")) {
                    st.push(ch2 / ch1);
                }
            }
            else st.push(Integer.parseInt(ch));
        } 
        return st.peek();
    }
} 