class Solution {
    public int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE, profit = 0;
        for(int x : prices){
            int temp = 0;
            if(x < minValue){
                minValue = x;
            }else{
                temp = x - minValue;
                if(temp > profit){
                    profit = temp;
                }
            }
        }
        return profit; 
    }
}