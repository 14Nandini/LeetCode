class Solution {
    public boolean checkString(String s) {
        return !s.contains("ba");
        // if(s.length() == 1) return true;
        // int aidx = s.lastIndexOf('a');
        // int bidx = s.indexOf('b');
        // if( aidx == 0 || bidx == 0 || aidx < bidx) return true;
        // return false;
    }
}