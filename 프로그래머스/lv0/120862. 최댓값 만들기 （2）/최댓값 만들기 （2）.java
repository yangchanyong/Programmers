import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int neg = 0;
        int pos = 0;
        Arrays.sort(numbers);
        neg = numbers[0] * numbers[1];
        pos = numbers[numbers.length-1] * numbers[numbers.length-2];
        return neg > pos ? neg : pos;
    }
}