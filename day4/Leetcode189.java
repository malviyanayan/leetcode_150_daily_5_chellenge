class Leetcode189 {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;

        // reverse all array
        reverse(nums, 0, nums.length-1);

        // reverse first part
        reverse(nums, 0, k-1);

        // reverse second part
        reverse(nums, k, nums.length-1);

        // now your array is rotate successfully
    }


    private static void reverse(int[] nums,int s,int e){
        while(s<e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
}
