package org.example;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] nums = {10,3,10,6,1,6};
        boolean ans = hasDuplicate(nums);
        System.out.println(ans);
    }

    public static boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            else{
                set.add(nums[i]);
            }
        }
        return false;
    }
}
