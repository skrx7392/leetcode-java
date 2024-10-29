package medium;

public class _189RotateArray {
    public void rotate(int[] nums, int k) {
        if (k == 0) {
            return;
        }
        k %= nums.length;
        int startingIndex = 0;
        int[] extraNums = new int[k];
        int tempNumber;
        while(startingIndex < k) {
            int iterator = startingIndex;
            tempNumber = nums[startingIndex];
            while (iterator < nums.length) {
                var replaceIndex = iterator + k;
                if(replaceIndex >= nums.length) {
                    var newIndex = replaceIndex - nums.length;
                    extraNums[newIndex] = tempNumber;
                    startingIndex++;
                    break;
                }
                else {
                    var placeHolder = nums[replaceIndex];
                    nums[replaceIndex] = tempNumber;
                    tempNumber = placeHolder;
                }
                iterator += k;
            }
        }
        System.arraycopy(extraNums, 0, nums, 0, k);
    }
}
