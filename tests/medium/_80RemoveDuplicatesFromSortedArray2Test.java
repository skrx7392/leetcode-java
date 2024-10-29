package medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static utils.TestUtils.convertStringToIntArray;
import static org.junit.jupiter.api.Assertions.*;

class _80RemoveDuplicatesFromSortedArray2Test {

    @ParameterizedTest
    @CsvSource({"'[1,1,1,2,2,3]', 5", "'[0,0,1,1,1,1,2,3,3]', 7"})
    void removeDuplicates(String numsString, int expected) {
        _80RemoveDuplicatesFromSortedArray2 obj = new _80RemoveDuplicatesFromSortedArray2();
        var nums = convertStringToIntArray(numsString);
        assertEquals(expected, obj.removeDuplicates(nums));
    }
}