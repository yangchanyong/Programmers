import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String myString) {
        String[] arr = myString.split("x");
        List<String> list = new ArrayList<>();
        for(String str : arr) {
            if(!str.isBlank()) {
                list.add(str);
            }
        }
        String[] answer = list.toArray(new String[list.size()]);
        Arrays.sort(answer);
        return answer;
    }
}