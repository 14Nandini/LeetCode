class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[1], b[1]));
        int count = 0, prevEnd = intervals[0][1];
        for(int i = 1; i < intervals.length; i++){
            int nextFirst = intervals[i][0];
            if(prevEnd > nextFirst) count++;
            else prevEnd = intervals[i][1];
        }
        return count;
    }
}