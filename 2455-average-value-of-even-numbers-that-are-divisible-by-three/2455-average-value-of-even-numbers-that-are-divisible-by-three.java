class Solution {
    public int averageValue(int[] nums) {
        int sum = 0, cnt = 0;
        for(int num : nums){
            if(num % 2 == 0 && num % 3 == 0){
                cnt++;
                sum += num;
            }
        }
        if(sum == 0 || cnt == 0) return 0;
        else return sum/cnt;
    }
}