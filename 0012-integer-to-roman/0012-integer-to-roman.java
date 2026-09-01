class Solution {
    public String intToRoman(int num) {
        StringBuilder res = new StringBuilder();
        String[] symbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        int i = 0;
        while(num > 0){
            if(num >= value[i]){
                res.append(symbol[i]);
                num -= value[i];
            }
            else i++;
        }
        return res.toString();
    }
}