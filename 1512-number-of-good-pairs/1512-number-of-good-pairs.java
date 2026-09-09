class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] freqs = new int[102];
        for(int num : nums) freqs[num]++;
        int totalCount = 0;
        for(int num : freqs) totalCount += (num * (num - 1))/2;
        return totalCount; 
    }
}