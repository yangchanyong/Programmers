class Solution {
    public int solution(int n, String control) {
        String[] result = new String[control.length()];
        
        for(int i=0; i<control.length(); i++) {
            result[i] = String.valueOf(control.charAt(i));
            switch(result[i]) {
            // switch(String.valueOf(control.charAt(i))) {
                case "w" :
                    n += 1;
                    break;
                case "s" :
                    n -= 1;
                    break;
                case "d" :
                    n += 10;
                    break;
                case "a" :
                    n -= 10;
                    break;
            }
        }
        return n;
    }
}