import java.lang.*;
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int solution(int[] numbers) {
        // Comparetor를 사용하기 위해 Integer배열 생성
        Integer[] nums = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        // 내림차순 정렬
        Arrays.sort(nums, Comparator.reverseOrder());
        int answer = nums[0] * nums[1];
        return answer;
    }

    // 사실 오름차순 후 계산했어도 되는데 내림차순을 써보고 싶었음.... ㅎㅎ
}
