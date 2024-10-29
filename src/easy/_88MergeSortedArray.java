package easy;

public class _88MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int firstStartIndex = m - 1;
        int secondStartIndex = n - 1;
        for(int i=nums1.length-1;i>=0;i--){
            if(secondStartIndex < 0) {
                nums1[i] = nums1[firstStartIndex];
                firstStartIndex--;
            }
            else if(firstStartIndex < 0) {
                nums1[i] = nums2[secondStartIndex];
                secondStartIndex--;
            }
            else if(nums1[firstStartIndex] > nums2[secondStartIndex]){
                nums1[i] = nums1[firstStartIndex];
                firstStartIndex--;
            }
            else{
                nums1[i] = nums2[secondStartIndex];
                secondStartIndex--;
            }
        }
    }
}
