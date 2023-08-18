class Solution {
    public int solution(int num, int k) {
        String n1 = num+"";
        String n2 = k+"";
        int answer = 0;
        if(n1.contains(n2)) {
            answer = n1.indexOf(n2)+1;
        }else {
            answer = -1;
        }
        return answer;
    }
}