package easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static utils.TestUtils.convertStringToIntArray;
import static org.junit.jupiter.api.Assertions.*;

class _27RemoveElementTest {

    @ParameterizedTest
    @CsvSource({"'[2,2,3]', 2, 1", "'[3,2,3,2]', 3, 2", "'[0,1,2,2,3,0,4,2]', 2, 5", "'[1]', 1, 0"})
    void removeElement(String numsString, int target, int expected) {
        _27RemoveElement removeElement = new _27RemoveElement();
        var nums = convertStringToIntArray(numsString);
        var result = removeElement.removeElement(nums, target);
        assertEquals(expected, result);
    }
}