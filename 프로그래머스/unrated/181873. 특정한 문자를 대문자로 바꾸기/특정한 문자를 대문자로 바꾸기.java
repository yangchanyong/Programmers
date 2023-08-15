import java.util.*;

class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        String[] result = new String[my_string.length()];
        // if(my_string.contains(alp)) {
        for(int i=0; i<my_string.length(); i++) {
            result[i] = String.valueOf(my_string.charAt(i));
            if(result[i].equals(alp)) {
                result[i] = alp.toUpperCase();
                }
            answer += result[i];
        }
        // }else {
            // answer = "lowercase";
        // }
        // answer = my_string.replace(alp, alp.toUpperCase());
        return answer;
    }
}