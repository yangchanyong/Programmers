class Solution {
    public String solution(String rsp) {
        // charAt으로 rep를 배열에 저장해야겠다고 생각함
        String answer = "";
        String[] rsp2 = new String[rsp.length()];
        for(int i=0; i<rsp2.length; i++) {
            rsp2[i] = String.valueOf(rsp.charAt(i));
        }
        for(int j=0; j<rsp2.length; j++) {
            if(rsp2[j].equals("2")) {
                answer += "0";
            }else if(rsp2[j].equals("0")) {
                answer += "5";
            }else {
                answer += "2";
            }
        }
        return answer;
    }
}