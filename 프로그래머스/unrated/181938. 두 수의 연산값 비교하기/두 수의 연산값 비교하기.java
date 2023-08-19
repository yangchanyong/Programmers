class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int num = Integer.parseInt(String.valueOf(a)+String.valueOf(b));
        int result = 2*a*b;
        answer = num > result ? num : result;
        return answer;
    }
}