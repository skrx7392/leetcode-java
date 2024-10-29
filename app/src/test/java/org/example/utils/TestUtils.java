package org.example.utils;

import java.util.Arrays;

public class TestUtils {


    public static int[] convertStringToIntArray(String input) {
        return Arrays.stream(input
                        .replace("[", "")
                        .replace("]", "")
                        .split(","))
                .mapToInt(Integer::parseInt).toArray();
    }
}
