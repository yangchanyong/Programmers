class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] num = s.split(" ");
        for(int i=0; i<num.length; i++) {
            if(!num[i].contains("Z")) {
               answer += Integer.parseInt(num[i]); 
            }else {
                answer -= Integer.parseInt(num[i-1]);
            }
        }
        return answer;
    }
}