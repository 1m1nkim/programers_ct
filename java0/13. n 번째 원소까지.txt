https://school.programmers.co.kr/learn/courses/30/lessons/181889

정수 리스트 num_list와 정수 n이 주어질 때, num_list의 첫 번째 원소부터 n 번째 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.

import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> a = new ArrayList();
        for(int i = 0; i< n; i++){
            a.add(num_list[i]);
        }
        return a.stream().mapToInt(Integer::intValue).toArray();
    }
}
// return Arrays.copyOfRange(num_list, 0, n);
//copyOfRange 어제 했는데 까먹고 있었다,,, 메소드 잘 기억하기