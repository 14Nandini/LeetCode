class Solution {
    public String decodeString(String s) {
        Stack<Integer> num = new Stack<>();
        Stack<String> str = new Stack<>();
        int k = 0;
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                k = k * 10 + (ch - '0');
            }
            else if(ch == '['){
                num.push(k);
                str.push(String.valueOf(ch));
                k = 0;
            }
            else if(ch == ']'){
                StringBuilder sb = new StringBuilder();
                while(!str.isEmpty() && !str.peek().equals("[")){
                    sb.insert(0, str.pop());
                }
                if(!str.isEmpty()) str.pop();
                String rpt = sb.toString().repeat(num.pop());
                str.push(rpt);
            }
            else str.push(String.valueOf(ch));
        }
        StringBuilder result = new StringBuilder();
        while (!str.isEmpty()) result.insert(0, str.pop());
        return result.toString();
    }
}