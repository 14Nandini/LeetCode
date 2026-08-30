class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if(n == 1) return 1;
        int minIdx = 0, maxIdx = 0;
        for(int i = 1; i < n; i++){
            if(nums[i] < nums[minIdx]) minIdx = i;
            if(nums[i] > nums[maxIdx]) maxIdx = i;
        }
        int low = Math.min(minIdx, maxIdx);
        int high = Math.max(minIdx, maxIdx);
        int fromFront = high + 1;
        int fromBack = n - low;
        int fromBoth = (low + 1) + (n - high);

        return Math.min(fromBoth, Math.min(fromFront, fromBack));
    }
}