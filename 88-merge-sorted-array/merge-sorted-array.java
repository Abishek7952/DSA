class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // we will use 3 ptr method
        int ptr1=m-1; //for non zero sorted ele in arr1(last element index)
        int ptr2=n-1; //arr2 (last ele index)
        int ptr3=m+n-1; //output arr last element

        //check ptr1&2 and 
        //replace greater no. in the last position of output array
        //move ptr to next element once array position filled
        while(ptr1>=0 && ptr2>=0){
            //if arr1 ele is greater
            if(nums1[ptr1]>nums2[ptr2]){
                nums1[ptr3]=nums1[ptr1];
                ptr1-=1;
                ptr3-=1;
            }
            //if arr2 ele is greater
            else{
                nums1[ptr3]=nums2[ptr2];
                ptr2-=1;
                ptr3-=1;
            }

        }

        //nums1 is already sorted so no issue if ele are leftover 
        //(as they are already in the right position)

        //in num2 if ele are leftover after greatest no check
        // push the leftover to nums1 in the remaining ptr3 postions
        while(ptr2>=0){
            nums1[ptr3]=nums2[ptr2];
            ptr3-=1;
            ptr2-=1;
        }


    }
}