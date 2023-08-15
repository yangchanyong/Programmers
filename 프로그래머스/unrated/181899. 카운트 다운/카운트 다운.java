class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[start-end+1];
        int cnt = start;
        for(int i=0; i<start-end+1; i++) {
            answer[i] = cnt;
            cnt--;
        }
        return answer;
    }
}