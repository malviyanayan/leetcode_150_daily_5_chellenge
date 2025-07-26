import java.util.HashMap;

class Leetcode169 {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num, 0)+1);
        }

        int temp = 0,tempFreq = 0;
        double n=nums.length/2;
        for(int key : map.keySet()){
            if(map.get(key) > n && map.get(key)>tempFreq){
                temp = key;
                tempFreq = map.get(key);
            }
        }
        return temp;
    }


    public boolean hasCycle1(ListNode head) {
        if (head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;           // move 1 step
            fast = fast.next.next;      // move 2 steps

            if (slow == fast) {
                return true;            // cycle detected
            }
        }

        return false;                   // no cycle
    }
}
