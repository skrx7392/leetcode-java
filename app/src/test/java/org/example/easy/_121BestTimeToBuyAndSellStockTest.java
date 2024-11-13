package org.example.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.example.utils.TestUtils.convertStringToIntArray;
import static org.junit.jupiter.api.Assertions.assertEquals;

class _121BestTimeToBuyAndSellStockTest {
    @ParameterizedTest
    @CsvSource({"'[7,1,5,3,6,4]', 5", "'[7,6,4,3,1]', 0"})
    void maxProfit(String pricesString, int expected) {
        var prices = convertStringToIntArray(pricesString);
        var obj = new _121BestTimeToBuyAndSellStock();
        var result = obj.maxProfit(prices);
        assertEquals(expected, result);
    }

}