
class Leetcode287 {




    // sabse ganda solution
    // time limit exceed
    public int findDuplicate1(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[nums[i]] < 0)return nums[i];
            nums[nums[i]] = -nums[nums[i]];
        }

        return 1;
    }


    // dekhte hai badhiya hai lekin array modify ho rha hai
    public int findDuplicate2(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=1;j<nums.length;j++){
                if(nums[i]==nums[j])return nums[i];
            }
        }   
        
        return 1;
    }


    // next solution
    // tortoise/cycle detection
    public int findDuplicate(int[] nums) {
    int slow = nums[0];
    int fast = nums[0];

    // Phase 1: Detect the cycle
    do {
        slow = nums[slow];
        fast = nums[nums[fast]];
    } while (slow != fast);

    // Phase 2: Find the entrance to the cycle (duplicate number)
    slow = nums[0];
    while (slow != fast) {
        slow = nums[slow];
        fast = nums[fast];
    }

    return slow; // or fast — both are same here
}


}
