package org.example.medium;

public class _80RemoveDuplicatesFromSortedArray2 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        if(nums.length == 2) {
            return 2;
        }
        int firstPointer = 1;
        int secondPointer = 2;
        while (secondPointer < nums.length) {
            if (nums[secondPointer] == nums[firstPointer] && nums[secondPointer] == nums[firstPointer-1]) {
                secondPointer++;
                continue;
            }
            firstPointer++;
            nums[firstPointer] = nums[secondPointer];
            secondPointer++;
        }
        return firstPointer + 1;
    }
}
