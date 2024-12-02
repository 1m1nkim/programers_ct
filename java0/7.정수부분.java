https://school.programmers.co.kr/learn/courses/30/lessons/181850

실수 flo가 매개 변수로 주어질 때, flo의 정수 부분을 return하도록 solution 함수를 완성해주세요.

class Solution {
    public int solution(double flo) {
        return (int)Math.floor(flo);
        // return (int)flo;
    }
}

Math의 함수인 floor를 사용하여 내림 처리하는게 맞다 생각했는데
생각해보니 (int)flo만 해도 소수점이 버려진다.......