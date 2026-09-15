class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] res = new int[2];
        for(int num : nums){
            hm.put(num, hm.getOrDefault(num, 0)+1);
        }
        for(int i = 1; i <= nums.length; i++){
            if(!hm.containsKey(i)) res[1] = i;
            else if(hm.get(i) > 1) res[0] = i;
        }
        return res;
    }
}