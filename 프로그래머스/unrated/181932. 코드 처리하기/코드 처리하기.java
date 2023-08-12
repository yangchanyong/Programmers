class Solution {
    public String solution(String code) {
        // mode는 0으로 시작
        // mode는 code문자열에 있는 "1"을 만나면 바뀌게됨
        // mode가 0일경우 짝수번 idx에 있는 문자열값을 ret에 추가
        // mode가 1일경우 홀수번 idx에 있는 문자열값을 ret에 추가
 int mode = 0;
        String rec = "";

        for(int idx=0; idx<code.length(); idx++){
          if( code.charAt(idx) == '1' ){
              mode = mode == 0 ? 1 : 0 ;
          }
          if( code.charAt(idx) == '1' ) continue;
            
          if(mode == 0 && idx%2 == 0){
             rec += code.charAt(idx); 
          }
        
           if(mode == 1 && idx%2 !=0 ){               
             rec += code.charAt(idx);
          }            
        }
  
        if (rec == null || rec.trim().isEmpty()){
            rec = "EMPTY";
        }
        
        return rec;
    }
}