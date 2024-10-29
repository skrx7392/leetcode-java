package org.example.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.example.utils.TestUtils.convertStringToIntArray;
import static org.junit.jupiter.api.Assertions.*;

class _169MajorityElementTest {

    @ParameterizedTest
    @CsvSource({"'[3,2,3]', 3", "'[2,2,1,1,1,2,2]', 2"})
    void majorityElement(String numsString, int expected) {
        _169MajorityElement majorityElement = new _169MajorityElement();
        var nums = convertStringToIntArray(numsString);
        assertEquals(expected, majorityElement.majorityElement(nums));
    }

    @ParameterizedTest
    @CsvSource({"'[3,2,3]', 3", "'[2,2,1,1,1,2,2]', 2"})
    void majorityElementWithoutMap(String numsString, int expected) {
        _169MajorityElement majorityElement = new _169MajorityElement();
        var nums = convertStringToIntArray(numsString);
        assertEquals(expected, majorityElement.majorityElementWithoutMap(nums));
    }
}