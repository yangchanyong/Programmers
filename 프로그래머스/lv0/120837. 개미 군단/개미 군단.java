class Solution {
    public int solution(int hp) {
        // 장군 5, 병정 3, 일 1 / 사냥감의 체력 hp / 사냥감의 체력에 딱 맞게 최소한의 병력을 구성
        int gen = hp/5;
        int sol = hp%5/3;
        int erg = hp%5%3/1;
        int answer = gen+sol+erg;
        return answer;
    }
}