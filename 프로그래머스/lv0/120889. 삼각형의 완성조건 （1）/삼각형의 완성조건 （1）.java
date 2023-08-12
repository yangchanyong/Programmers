class Solution {
    public int solution(int[] sides) {
        int[] maxResult = new int[1];
        int result = 0;
        for(int i=0; i<sides.length; i++) {
            if(maxResult[0] < sides[i]) {
                maxResult[0] = sides[i];
            }
            result += sides[i];
        }
        int result2 = result-maxResult[0];
        return result2 > maxResult[0] ? 1:2;
        // return maxResult[0];
    }
}