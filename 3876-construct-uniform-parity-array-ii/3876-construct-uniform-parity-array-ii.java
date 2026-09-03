class Solution {
    public boolean uniformArray(int[] nums1) {
        int minOdd = Integer.MAX_VALUE;
        int minEven = Integer.MAX_VALUE;
        for(int num : nums1){
            if(num % 2 == 0 ){ 
                if( num < minEven) minEven = num;
            }
            else{
                if(num < minOdd) minOdd = num;
            }
        }
        if(minEven == Integer.MAX_VALUE) return true;
        if(minOdd == Integer.MAX_VALUE) return true;

        return minOdd < minEven; 
    }
}