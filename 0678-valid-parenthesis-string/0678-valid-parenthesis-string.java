class Solution {
    public boolean checkValidString(String s) {
        int i = 0, j = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                i++;
                j++;
            }
            else if (c == ')') {
                i = Math.max(0, i - 1);
                j--;
            }
            else {
                i = Math.max(0, i - 1);
                j++;
            }

            if (j < 0) return false;
        }

        return i == 0;
    }
}