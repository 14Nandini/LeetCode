class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int num : nums) hs.add(num);
        int maxCnt = 0;
        for(int num : hs){
            if(!hs.contains(num - 1)){
                int cNum = num;
                int c = 1;
                while(hs.contains(cNum + 1)){
                    cNum += 1;
                    c += 1;
                }
                maxCnt = (c > maxCnt) ? c : maxCnt;
            }
        }
        return maxCnt;
    }
}