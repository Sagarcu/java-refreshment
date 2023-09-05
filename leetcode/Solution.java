package leetcode;

public class Solution {

    public int[] twoSumSolveSlow(int[] nums, int target) {
        int counter = 0;

        for (int element : nums) {
            for (int i = counter + 1; i < nums.length; i++) {
                if (element + nums[i] == target) {
                    return new int[]{counter, i};
                }
            }
            counter++;
        }


        return null;
    }

    public int[] twoSumSolve(int[] nums, int target) {
        int first = 0;
        int second = 1;
        int window = 1;

        while (true) {
            if (nums[first] + nums[second] == target) {
                break;
            } else if (second == nums.length - 1) {
                window++;
                first = 0;
                second = window;
            } else {
                first++;
                second++;
            }
        }
        return new int[]{first, second};
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String palindrome = Integer.toString(x);
        char[] palindromeCharArray = palindrome.toCharArray();

        StringBuilder reversed = new StringBuilder();

        for (int i = palindrome.length(); i > 0; i--) {
            reversed.append(palindromeCharArray[i - 1]);
        }

        String reversedPalindrome = reversed.toString();

        return palindrome.equals(reversedPalindrome);
    }
}
