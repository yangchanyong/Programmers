class Solution {
    public int solution(int[] arr, int idx) {
        // 배열의 index가 idx보다 커야함.
        int answer = 0;
        for(int i=0; i<arr.length; i++) {
            if(idx <= i && arr[i] == 1) {
                answer = i;
                break;
            }else {
                answer = -1;
            }
        }
        return answer;
    }
}