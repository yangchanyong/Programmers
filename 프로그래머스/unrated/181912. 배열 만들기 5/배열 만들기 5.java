import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(String[] intStrs, int k, int s, int l) {
        // s번 인덱스에서 시작
        // l짜리 부분 문자열을 잘라내 정수로 변환
        // 변환한 값이 k보다 큰 값을 담은 배열 리턴
        // int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<intStrs.length; i++) {
            int num = Integer.parseInt(intStrs[i].substring(s, s+l));
            if(num > k) {
                list.add(num);
            }
            
        }
        return list;
    }
}