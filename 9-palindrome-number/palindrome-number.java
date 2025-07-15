class Solution {
    public boolean isPalindrome(int x) {
        int reverse=0;
        int originalno=x;
        String xstr=Integer.toString(x);
        char xchr=xstr.charAt(0);
        if (xchr=='-'){
            return false;
        }
        while(x>0){
        int rem= x%10;
        reverse=reverse*10+rem;
        x=x/10;
        }
        if (reverse==originalno){
            return true;
        }
        else {
            return false;
        }



        
    }
}