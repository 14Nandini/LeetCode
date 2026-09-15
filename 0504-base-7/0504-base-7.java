class Solution {
    public String convertToBase7(int num) {
        if(num == 0) return "0";
        boolean isNegative = false;
        if(num < 0){
            isNegative = true;
            num = Math.abs(num);
        }
        StringBuilder sb = new StringBuilder();
        while(num > 0){
            int res = num % 7;
            sb.insert(0, res);
            num = num / 7;
        }
        String res = sb.toString();
        return isNegative ? "-" + res : res;
    }
}
