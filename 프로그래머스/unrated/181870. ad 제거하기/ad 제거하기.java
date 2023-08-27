import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>();
        for(int j=0; j<strArr.length; j++) {
            if(!strArr[j].contains("ad")) {
                list.add(strArr[j]);
            }
        }
        String[] answer = new String[list.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}