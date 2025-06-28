class Solution {
    public void reverseString(char[] s) {
        int start=0;
        int end=s.length-1;
        System.out.println(reverse(s,start,end));

    }
    static char[] reverse(char[] s,int start,int end){
        while (start<end){
            char temp=s[start];
            s[start]=s[end];
            s[end] =temp;
            start++;
            end--;       }
        return s;
    }
}