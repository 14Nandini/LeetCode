class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int num : nums) hs.add(num);
        if(hs.size() < 3) return Collections.max(hs);
        hs.remove(Collections.max(hs));
        hs.remove(Collections.max(hs));
        return Collections.max(hs);
    }
}