class Solution {
    public void moveZeroes(int[] nums) {
        // #push all non zero elements to front of the array
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }

        // #fill the vacant trailing spaces of the array length with zeros
        while(j<nums.length){
            nums[j]=0;
            j++;
        }
    }
}