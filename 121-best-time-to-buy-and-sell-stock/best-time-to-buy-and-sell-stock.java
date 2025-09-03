class Solution {
    public int maxProfit(int[] prices) {
        int minsofar=prices[0];
        int maxprofit=0;
        // check everyday with fror loop
        for (int i=0;i<prices.length;i++){

            // update min each day
            //if min updated profit is not calc on tht day
            // buy n sell diff days so if-else loop

            if(minsofar>prices[i]){
                minsofar=prices[i];
                
            }

            // calc profit on non min updated days 
            // find max profit on all days combo
            else{
                int profit=prices[i]-minsofar;
                if(profit>maxprofit){
                    maxprofit=profit;
                }
            }
            


        }
        return maxprofit;
    }
}