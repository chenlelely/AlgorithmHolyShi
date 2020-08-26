package main.array;

import java.util.HashMap;

/**
 * @Author: ChenLele
 * @Date: 2020/8/26 22:35
 * @Description: 两个数字之和 https://leetcode-cn.com/problems/two-sum/
 */
public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int k = target - nums[i];
            if (map.containsKey(k)) {
                res[0] = map.get(k);
                res[1] = i;
                return res;
            }
            map.put(nums[i], i);
        }

        return null;
    }
}
