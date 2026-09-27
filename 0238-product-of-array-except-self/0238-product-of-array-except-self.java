class Solution {
    public int[] productExceptSelf(int[] nums) {

        
        int n = nums.length;
        int[] answer = new int[n];

        // STEP-1 Claculate prefix products

        int prefix = 1;
        for(int i=0; i<n; i++){
            answer[i] = prefix;
            prefix *= nums[i];
        }

        //STEP-2 calculate suffix products

        int suffix = 1;

        for(int i=n-1; i>=0; i--){
            answer[i] *= suffix;
            suffix *= nums[i];
        }

        return answer;
    }
}