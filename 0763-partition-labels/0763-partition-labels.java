class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character, Integer>  hm = new HashMap<>();
        for(int i = s.length()-1; i >= 0; i--){
            char ch = s.charAt(i);
            if(!hm.containsKey(ch)) hm.put(ch, i);
        }
        List<Integer> res = new ArrayList<>();
        int i = 0, j = 0;
        for(int k = 0; k < s.length(); k++){
            char ch = s.charAt(k);
            int lastOcc = hm.get(ch);
            j = Math.max(j, lastOcc);
            if(j == k){
                res.add(j-i+1);
                i = j + 1;
            }
        }
        return res;
    }
}