class Solution {
    public void sortColors(int[] nums) {
        
        int low=0;
        int mid=0;
        int high = nums.length-1;

        while(mid <= high){
            if(nums[mid] == 0){
                // move to the left

                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;

            }else if(nums[mid] == 1){
                // 1is already in correct middle region
                mid++;

            }else{
                // move 2 to right

                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}