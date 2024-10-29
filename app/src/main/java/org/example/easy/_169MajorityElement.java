package org.example.easy;

import java.util.HashMap;

public class _169MajorityElement {
    public int majorityElement(int[] nums) {
        var map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for(var key : map.keySet()) {
            if(map.get(key) > nums.length/2) {
                return key;
            }
        }
        return -1;
    }

    public int majorityElementWithoutMap(int[] nums) {
        var res = nums[0];
        var majority = 0;
        for (int num : nums) {
            if (majority == 0) {
                res = num;
            }
            if (num == res) {
                majority++;
            } else {
                majority--;
            }
        }
        var count = 0;
        for (int num : nums) {
            if (num == res) {
                count++;
            }
        }
        if (count > nums.length/2) {
            return res;
        }
        return -1;
    }
}
