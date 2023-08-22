class Solution {
    public int solution(String number) {
        int answer = 0;
        int[] result = new int[number.length()];
        for(int i=0; i<result.length; i++) {
            result[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
            answer += result[i];
        }
        answer = answer%9;
        return answer;
    }
}