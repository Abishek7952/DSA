class Solution {
    public static void main(String[] args){
        int[] nums = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(searchRange(nums,target));
    }
   

    static int[] searchRange(int[] nums, int target){
        int[] ans={-1,-1};
        int start=binarysearch(nums,target,true);
        int end=binarysearch(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    static int binarysearch(int[] arr, int tgt, boolean findstart) {
        int ans=-1;
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid=s+(e-s)/2;

            if(tgt<arr[mid]){
                e=mid-1;
            }
            else if(tgt>arr[mid]){
                s=mid+1;
            }
            else if(tgt==arr[mid]){
                 ans=mid;
                if(findstart==true){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
        }
        return ans;
    }
}