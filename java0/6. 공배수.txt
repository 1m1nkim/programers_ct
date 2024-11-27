https://school.programmers.co.kr/learn/courses/30/lessons/181936

정수 number와 n, m이 주어집니다. number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.

class Solution {
    public int solution(int number, int n, int m) {
        //return  number % (n*m) == 0? 1 : 0;
        return (number % n == 0 && number % m == 0) ? 1 : 0;
    }
}
//주석문의 return 인 경우 테스트 케이스 1개에서 불가능
//n이 10 m이 20인 경우엔 불가능하다.라네요