class Solution {
    public int solution(int n) {
        int answer = 0;
        int pizza = 6;
        for(int i=1; ; i++) {
            if(i*pizza % n == 0) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}