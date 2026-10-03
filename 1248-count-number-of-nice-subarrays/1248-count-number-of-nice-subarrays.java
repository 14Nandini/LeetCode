class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        int currCnt = 0, subCnt = 0;
        for(int num : nums){
            currCnt += num % 2;
            if(hm.containsKey(currCnt - k)){
                subCnt += hm.get(currCnt - k);
            }
            hm.put(currCnt, hm.getOrDefault(currCnt, 0) + 1);
        }
        return subCnt;
    }
}