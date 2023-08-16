import java.util.*;

class Solution {
    public List<Integer> solution(int[] num_list) {
        // int[] answer = new int[num_list.length];
        List<Integer> list = new ArrayList<>();
        for(int num : num_list) {
            list.add(num);
        }
        Collections.sort(list);
        for(int i=0; i<5; i++) {
            list.remove(0);
        }
        return list;
    }
}