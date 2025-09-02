class Solution {
    public boolean isPalindrome(String s) {
        
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]","");

        int start=0;
        int end=s.length()-1;

        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            
            }
            else{
                start+=1;
                end-=1;
            }
        }
        return true;
    }
}