class Solution {
    public int solution(int[] num_list) {
        // int num = 0;
        int answer = 0;
        int cnt = 0;
        
        // 학원다닐때 풀던거
        // for(int i=0; i<num_list.length; i++) {
        //     num = num_list[i];
        //     if(num > -1) {
        //         answer = -1;
        //     }else if(num < -1) {
        //         return num_list.length;
        //     }
        // }
        
        // 현 풀이
        for(int i=0; i<num_list.length; i++) {
            if(num_list[i] < 0) {
                answer = i;
                break;
            }else {
                answer = -1;
            }
        }
        return answer;
    }
}