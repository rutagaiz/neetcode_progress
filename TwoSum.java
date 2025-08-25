package org.example;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 6};
//        int[] ans = twoSum1(nums, 7);
        int[] ans = twoSum2(nums, 7);
        System.out.println(ans[0] + " " + ans[1]);
    }

//    O(n^2) sudetingumas:
    public static int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    int[] answer = {i, j};
                    return answer;
                }
            }
        }
        return null;
    }

//    O(n) sudetingumas:
    public static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (map.containsKey(difference) && i != map.get(difference)) {
                return new int[]{map.get(difference), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
