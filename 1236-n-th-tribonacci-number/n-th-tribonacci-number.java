
//fibonacci -add 2 nos tribonacci add 3 
class Solution {

    public int tribonacci(int n){
        int[] arr=new int[n+1];
        Arrays.fill(arr,-1);
        return tribosum(n,arr);
    }

// recurssive function for execution
    public int tribosum(int n,int[] arr) {
        if(n<2){
            return n;
        }
        if(n==2){
            return 1 ;
        }
        if(arr[n]!=-1){
            return arr[n];
        }

       arr[n]=tribosum(n-1,arr)+tribosum(n-2,arr)+tribosum(n-3,arr);
      return arr[n];
    }
}
