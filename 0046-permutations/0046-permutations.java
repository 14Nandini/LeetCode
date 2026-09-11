class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        backtrack(resList, new ArrayList<>(), nums);
        return resList;
    }

    public static List<List<Integer>> backtrack(List<List<Integer>> resList, List<Integer> tempList, int[] nums){
        if(tempList.size() == nums.length){
            resList.add(new ArrayList<>(tempList));
            return resList;
        }
        for(int num : nums){
            if(tempList.contains(num)) continue;
            tempList.add(num);
            backtrack(resList, tempList, nums);
            tempList.remove(tempList.size() - 1);
        }
        return resList;
    }
}