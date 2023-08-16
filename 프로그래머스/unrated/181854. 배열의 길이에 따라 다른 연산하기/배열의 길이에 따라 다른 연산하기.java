import java.util.*;

class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        answer = Arrays.copyOfRange(arr, 0, arr.length);
        if(arr.length % 2 == 1) {
            for(int i=0; i<arr.length; i++) {
                if(i % 2 == 0) {
                    answer[i] = arr[i] + n;
                }
            }
        }else {
            for(int i=0; i<arr.length; i++) {
                if(i % 2 == 1) {
                    answer[i] = arr[i] + n;
                }
            }
        }
        return answer;
    }
}