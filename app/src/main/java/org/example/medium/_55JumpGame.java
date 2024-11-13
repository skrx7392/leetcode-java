package org.example.medium;

public class _55JumpGame {
    public boolean canJump(int[] nums) {
        if(nums.length < 2) {
            return true;
        }
        int index = 0;
        int maxReachable = 0;
        while(index < nums.length) {
            if (index > maxReachable) {
                return false;
            }
            int reachable = nums[index] + index;
            if(maxReachable < reachable) {
                maxReachable = reachable;
            }
            index++;
            if(maxReachable >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}
