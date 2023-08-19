class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        String[] str1_arr = new String[str1.length()];
        String[] str2_arr = new String[str2.length()];
        for(int i=0; i<str1.length(); i++) {
            str1_arr[i] = String.valueOf(str1.charAt(i));
            str2_arr[i] = String.valueOf(str2.charAt(i));
            answer += str1_arr[i] + str2_arr[i];
        }
        return answer;
    }
}