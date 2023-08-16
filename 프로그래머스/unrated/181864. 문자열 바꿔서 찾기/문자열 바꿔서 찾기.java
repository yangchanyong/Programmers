class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String[] arr = new String[myString.length()];
        String result = "";
        for(int i=0; i<myString.length(); i++) {
            arr[i] = String.valueOf(myString.charAt(i));
            
            if(arr[i].equals("A")) {
                arr[i] = "B";
            }else {
                arr[i] = "A";
            }
            result += arr[i];
        }
        
        if(result.contains(pat)) {
            answer = 1;
        }
        return answer;
    }
}