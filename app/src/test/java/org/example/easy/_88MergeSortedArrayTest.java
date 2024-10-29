package org.example.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.example.utils.TestUtils.convertStringToIntArray;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class _88MergeSortedArrayTest {

    @ParameterizedTest
    @CsvSource({"'[1,2,3,0,0,0]', 3, '[4,5,6]', 3, '[1,2,3,4,5,6]'",
            "'[1,2,3,0,0,0]', 3, '[2,5,6]', 3, '[1,2,2,3,5,6]'"})
    public void merge(String nums1String, int m, String nums2String, int n, String expected) {
        int[] nums1 = convertStringToIntArray(nums1String);
        int[] nums2 = convertStringToIntArray(nums2String);
        int[] expectedArray = convertStringToIntArray(expected);

        _88MergeSortedArray merge = new _88MergeSortedArray();
        merge.merge(nums1, m, nums2, n);
        assertArrayEquals(expectedArray, nums1);
    }
}