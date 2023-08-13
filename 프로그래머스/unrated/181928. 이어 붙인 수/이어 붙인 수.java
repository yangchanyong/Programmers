class Solution {
    public int solution(int[] num_list) {
        // String으로 형변환 후 int로 다시 형변한 한 뒤 두 값을 더하면 될듯
        int answer = 0;
        String odd = "";
        String even = "";
        for(int i=0; i<num_list.length; i++) {
            if(num_list[i] % 2 == 1) {
                odd += String.valueOf(num_list[i]);
            }else {
                even += String.valueOf(num_list[i]);
            }
        }
        answer = Integer.parseInt(odd) + Integer.parseInt(even);
        return answer;
    }
}