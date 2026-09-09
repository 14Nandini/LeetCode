class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        hm1.put(0,1);
        for(int num : nums){
            HashMap<Integer, Integer> hm2 = new HashMap<>();
            for(int sum : hm1.keySet()){
                int c = hm1.get(sum);
                hm2.put(sum + num, hm2.getOrDefault(sum + num, 0) + c);
                hm2.put(sum - num, hm2.getOrDefault(sum - num, 0) + c);
            }
            hm1 = hm2;
        }
        return hm1.getOrDefault(target, 0);
    }
}