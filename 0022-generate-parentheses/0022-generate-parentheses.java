class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backtrack(list, "", 0, 0, n);
        return list;
    }
    private void backtrack(List<String> res, String currStr, int openCnt, int closeCnt, int max){
        if(currStr.length() == max*2){
            res.add(currStr);
            return;
        }

        if(openCnt < max)
            backtrack(res, currStr + "(", openCnt + 1, closeCnt, max);
        if(closeCnt < openCnt)
            backtrack(res, currStr + ")", openCnt, closeCnt + 1, max);
    }
}