https://school.programmers.co.kr/learn/courses/30/lessons/120910

어떤 세균은 1시간에 두배만큼 증식한다고 합니다. 처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때 t시간 후 세균의 수를 return하도록 solution 함수를 완성해주세요.

정답: 
class Solution {
    public int solution(int n, int t) {
        int answer = n * ((int) Math.pow(2, t));
        return answer; 
    }
}
//좋은 정답 
class Solution {
    public int solution(int n, int t) {
        int answer = n << t ;   //n쪽으로 t만큼 비트연산 했을경우 n * 2^t의 연산과 같음
        return answer;
    }
}