package org.example.medium;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.example.utils.TestUtils.convertStringToIntArray;
import static org.junit.jupiter.api.Assertions.*;

class _55JumpGameTest {

    @ParameterizedTest
    @CsvSource({"'[2,3,1,1,4]', true", "'[3,2,1,0,4]', false"})
    void canJump(String numsString, boolean expected) {
        var nums = convertStringToIntArray(numsString);
        var obj = new _55JumpGame();
        var result = obj.canJump(nums);
        assertEquals(expected, result);
    }
}