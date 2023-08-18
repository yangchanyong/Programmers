class Solution {
    public int solution(int order) {
        int answer = 0;
        String num1 = String.valueOf(order);
        String[] num2 = new String[num1.length()];
        for(int i=0; i<num2.length; i++) {
            num2[i] = String.valueOf(num1.charAt(i)).replace("3", "a").replace("6", "a").replace("9", "a");
            if(num2[i].contains("a")) {
                answer++;
            }
        }
        return answer;
    }
}