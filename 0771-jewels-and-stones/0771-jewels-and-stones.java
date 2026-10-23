class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char ch : jewels.toCharArray()){
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        int res = 0;
        for(char ch : stones.toCharArray()){
            if(hm.containsKey(ch)) res += hm.get(ch);
        }
        return res;
    }
}