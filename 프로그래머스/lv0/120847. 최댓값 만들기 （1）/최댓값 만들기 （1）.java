import java.lang.*;
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int solution(int[] numbers) {
        Integer[] nums = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        Arrays.sort(nums, Comparator.reverseOrder());
        int answer = nums[0] * nums[1];
        return answer;
    }
}