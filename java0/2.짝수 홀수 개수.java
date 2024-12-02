https://school.programmers.co.kr/learn/courses/30/lessons/120824

정수가 담긴 리스트 num_list가 주어질 때, num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.

내 정답:
class Solution {
    public int[] solution(int[] num_list) {
        int a = 0;
        int b = 0;
        for(int num : num_list){
            a += (num % 2 == 0) ? 1 : 0; 
            b += (num % 2 != 0) ? 1 : 0;
        }
        
        return new int[] {a, b};
    }
}