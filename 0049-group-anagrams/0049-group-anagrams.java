class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        for(String str : strs){
            String freqStr = getFreqStr(str);
            if(hm.containsKey(freqStr)){
                hm.get(freqStr).add(str);
            }
            else{
                List<String> temp = new ArrayList<>();
                temp.add(str);
                hm.put(freqStr, temp);
            }
        }
        return new ArrayList<>(hm.values());
    }
    private String getFreqStr(String str){
        int[] freq = new int[26];
        StringBuilder res = new StringBuilder("");
        for(char ch : str.toCharArray()){
            freq[ch - 'a']++;
        }
        char ch = 'a';
        for(int i : freq){
            res.append(ch);
            res.append(i);
            ch++;
        }
        return res.toString();
    }
}