package easy;

public class _26RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1) {
            return 1;
        }
        int firstPointer = 0;
        int secondPointer = 1;
        while (secondPointer < nums.length) {
            if (nums[secondPointer] == nums[firstPointer]) {
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
