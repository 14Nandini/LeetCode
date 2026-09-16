class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int cval;
            if(ch == 'I') cval = 1;
            else if(ch == 'V') cval = 5;
            else if(ch == 'X') cval = 10;
            else if(ch == 'L') cval = 50;
            else if(ch == 'C') cval = 100;
            else if(ch == 'D') cval = 500;
            else cval = 1000;

            if(i + 1 < s.length()){
                char nch = s.charAt(i+1);
                if( (ch == 'I' && (nch == 'V' || nch == 'X') )|| 
                    (ch == 'X' && (nch == 'L' || nch == 'C')) ||
                    (ch == 'C' && (nch == 'D' || nch == 'M'))    
                ){
                    sum -= cval;
                    continue;
                }
            }
            sum += cval;
        }
        return sum;
    }
}