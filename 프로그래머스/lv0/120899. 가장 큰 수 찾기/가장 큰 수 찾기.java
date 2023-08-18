class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = 0;
        int cnt = 0;
        for(int i=0; i<array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        for(int j=0; j<array.length; j++) {
            if(max == array[j]) {
                cnt = j;
                break;
            }
        }
        answer[0] = max;
        answer[1] = cnt;
        return answer;
    }
}