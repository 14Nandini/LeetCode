class Solution {
    public String sortSentence(String s) {
        HashMap<Integer, String> hm = new HashMap<>();
        for(String str : s.split(" ")){
            int l = str.length() - 1;
            int d = str.charAt(l);
            hm.put(d - '0', str.substring(0,l));
        }
        StringBuilder res = new StringBuilder();
        for(Map.Entry<Integer, String> map : hm.entrySet()){
            res.append(map.getValue() + " ");
        }
        return res.toString().trim();
    }
}