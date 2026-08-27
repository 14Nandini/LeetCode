class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> al = new ArrayList<>();
        for(String str : operations){
            if(str.equals("+")){
                int last = al.get(al.size()-1);
                int secLast = al.get(al.size()-2);
                al.add(last + secLast);
            }
            else if(str.equals("D")){
                al.add(2 * (al.get(al.size()-1)));
            }
            else if(str.equals("C")){
                al.remove(al.size()-1);
            } 
            else{
                al.add(Integer.parseInt(str));
            }
        }
        int res = 0;
        for(int i : al) res += i;
        return res;
    }
}