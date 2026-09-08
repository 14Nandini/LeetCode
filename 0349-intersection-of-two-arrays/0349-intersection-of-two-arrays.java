class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> al = new ArrayList<>();
        HashSet<Integer> hs1 = new HashSet<>();
        for(int num : nums2) hs1.add(num);

        HashSet<Integer> hs2 = new HashSet<>();
        for(int num : nums1) hs2.add(num);

        for(int num : hs1){
            if(hs2.contains(num)) al.add(num);
        }
        int[] res = new int[al.size()];
        for(int i = 0; i < al.size(); i++) res[i] = al.get(i);
        return res;
    }
}