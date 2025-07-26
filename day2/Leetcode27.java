class Leetcode27{
    public int removeElement(int[] nums, int val) {
        // we are using two pointers method
        int left = 0;
        int right = nums.length;

        int k = 0;

        // move right pointer in left direction while element is 2
        // start loop while left element is not equal to two
        while (left < right) {
            while(left < right && nums[left] != 2)left++;
            if(left<right && nums[left] == 2)k++;
            while(left < right && nums[right] == 2)right--;

            // swap first 2 and last not 2 element
            if(left < right && nums[left] == 2){
                int temp = nums[left];
                nums[left]= nums[right];
                nums[right] = temp;
            }
        }

        return k;
    }

}