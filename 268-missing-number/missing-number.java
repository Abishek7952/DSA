class Solution {
    public int missingNumber(int[] nums) {
        int[] sorted=sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]){
                return i;
            }
        }
        return nums.length;
    }
    static int[] sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int current=arr[i];
            if(arr[i]<arr.length && arr[current]!=arr[i]){
                swap(arr,current,i);
            }
            else{
                i++;
            }

        }
        return arr;
    }
    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}