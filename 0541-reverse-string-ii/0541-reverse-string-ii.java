class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i += 2 * k) {
            int end = Math.min(s.length(), i+k);
            StringBuilder temp = new StringBuilder(s.substring(i,end));
            temp.reverse();

            sb.replace(i, end, temp.toString());
        }
        return sb.toString();
    }
}