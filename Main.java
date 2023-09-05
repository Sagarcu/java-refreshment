import leetcode.Solution;

import java.util.Arrays;

public class Main {

    static Solution solution = new Solution();
    public static void main(String[] args)  {
        System.out.println("Hello world");
        twoSum();
        isPalindrome();
    }

    public static void isPalindrome() {
        int palindrome = 10101;
        System.out.println(solution.isPalindrome(palindrome));
    }

    public static void twoSum() {
        int[] numbers = {5,8,7,4,6};
        int target = 10;

        System.out.println(Arrays.toString(solution.twoSumSolve(numbers, target)));
    }
}
