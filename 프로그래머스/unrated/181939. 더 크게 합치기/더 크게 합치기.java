class Solution {
    public int solution(int a, int b) {
        String str1 = String.valueOf(a);
        String str2 = String.valueOf(b);
        String str3 = str1.concat(str2);
        String str4 = str2.concat(str1);
        int result1 = Integer.parseInt(str3);
        int result2 = Integer.parseInt(str4);
        int answer = 0;
        if(result1 > result2) {
            answer = result1;
        }else {
            answer = result2;
        }
        return answer;
    }
}