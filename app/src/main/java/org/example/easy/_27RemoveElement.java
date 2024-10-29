package org.example.easy;

public class _27RemoveElement {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0)
            return 0;
        int firstIndex = 0;
        int secondIndex = nums.length;
        while(firstIndex < secondIndex)
        {
            if (nums[firstIndex] == val)
            {
                nums[firstIndex] = nums[secondIndex - 1];
                secondIndex--;
                continue;
            }
            firstIndex++;
        }
        return firstIndex;
    }
}
