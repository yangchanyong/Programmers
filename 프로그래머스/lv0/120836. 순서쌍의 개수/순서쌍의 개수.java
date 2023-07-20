class Solution {
    public int solution(int n) {
        int answer = 0;
        // 순서쌍의 갯수를 return
        // 나머지가 0 일때 ++ 하면 될듯?
        for(int i=1; i<=n; i++) {
            if(n % i == 0) {
                answer++;
            }
        }
        return answer;
    }
}