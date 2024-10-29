package org.example.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.example.utils.TestUtils.convertStringToIntArray;
import static org.junit.jupiter.api.Assertions.assertEquals;

class _26RemoveDuplicatesFromSortedArrayTest {

    @ParameterizedTest
    @CsvSource({"'[1,1,2]', 2", "'[0,0,1,1,1,2,2,3,3,4]', 5"})
    void removeDuplicates(String numsString, int expected) {
        _26RemoveDuplicatesFromSortedArray obj = new _26RemoveDuplicatesFromSortedArray();
        var nums = convertStringToIntArray(numsString);
        assertEquals(expected, obj.removeDuplicates(nums));
    }
}