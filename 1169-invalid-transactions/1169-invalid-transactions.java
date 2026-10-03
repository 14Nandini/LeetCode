class Solution {
    public List<String> invalidTransactions(String[] transactions) {
        int n = transactions.length;
        Transaction[] t = new Transaction[n];
        boolean[] invalid = new boolean[n];
        for(int i = 0; i < n; i++){
            t[i] = new Transaction(transactions[i]);
            if(t[i].amount > 1000){
                invalid[i] = true;
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(Math.abs(t[i].time - t[j].time) <= 60 && 
                t[i].name.equals(t[j].name) && !t[i].city.equals(t[j].city)){
                    invalid[i] = true;
                    invalid[j] = true;
                }
            }
        }
        List<String> res = new ArrayList<String>();
        for(int i = 0; i < n; i++){
            if(invalid[i]) res.add(transactions[i]);
        }
        return res;
    }
}

class Transaction{
    String transaction;
    String name;
    int time;
    int amount;
    String city;

    Transaction(String transaction){
        this.transaction = transaction;
        String[] tr = transaction.split(",");
        name = tr[0];
        time = Integer.parseInt(tr[1]);
        amount = Integer.parseInt(tr[2]);
        city = tr[3];
    }
}