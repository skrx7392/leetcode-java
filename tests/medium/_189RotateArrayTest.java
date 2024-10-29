package medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static utils.TestUtils.convertStringToIntArray;
import static org.junit.jupiter.api.Assertions.*;

class _189RotateArrayTest {

    @ParameterizedTest
    @CsvSource({"'[1,2,3,4,5,6,7]', 3, '[5,6,7,1,2,3,4]'", "'[-1,-100,3,99]', 2, '[3,99,-1,-100]'"})
    void rotate(String numsString, int k, String expectedString) {
        _189RotateArray obj = new _189RotateArray();
        var nums = convertStringToIntArray(numsString);
        var expected = convertStringToIntArray(expectedString);
        obj.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
        assertArrayEquals(expected, nums);
    }
}