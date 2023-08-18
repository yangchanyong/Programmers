import java.util.*;

class Solution {
    public List solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        for(int num : arr) {
            list.add(num);
        }
        for(int del : delete_list) {
            int index = list.indexOf(del);
            if(index != -1) {
                list.remove(index);
            }
        }
        
        return list;
    }
}