import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] str = new String[my_string.length()];
        for(int i=0; i<str.length; i++) {
            str[i] = String.valueOf(my_string.charAt(i));
        }
        Set<String> set = new HashSet<>();
        for(String result : str) {
            if(set.add(result)) {
                answer += result;
            }
        }
        return answer;
    }
}