https://school.programmers.co.kr/learn/courses/30/lessons/120822?language=java

문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.

class Solution {
    public String solution(String my_string) {
        return new StringBuffer(my_string).reverse().toString();
    }
}

//reverse 함수는 StringBuffer에 있으므로 String인 my_string을 스트링 버퍼로 만들어 reverse()해줌