class Solution {
    public int countPrimes(int n) {
        boolean[] primearr=new boolean[n];
        for(int i=0;i<n;i++){
            primearr[i]=true;
        }
        // simple sieve algo:
        for(int i=2;i*i<n;i++){
            if(primearr[i]==true){
                for(int j=i*i;j<n;j+=i){
                    primearr[j]=false;
                }
            }
        }
        int count=0;
        // print n count
        for(int i=2;i<n;i++){
            
            if(primearr[i]){
                count++;
            }
        }
        return count;
    }
}