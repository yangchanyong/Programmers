import java.util.*;

class Solution {
    public List solution(int n, int k) {
        List<Integer> answer = new ArrayList<>();
        for(int i=1; i<=n/k; i++) {
            answer.add(k*i);
        }
        return answer;
    }
}