class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber > 0){
            columnNumber = columnNumber - 1;
            int r = columnNumber % 26;
            sb.append((char)('A' + r));
            columnNumber = columnNumber / 26;
        }
        return sb.reverse().toString();
    }
}