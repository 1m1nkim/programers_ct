https://school.programmers.co.kr/learn/courses/30/lessons/181853

정수로 이루어진 리스트 num_list가 주어집니다. num_list에서 가장 작은 5개의 수를 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.

import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        return Arrays.stream(num_list)
                     .sorted()
                     .limit(5)
                     .toArray();
        //Arrays.sort(num_list);
        //return Arrays.copyOfRange(num_list, 0, 5);
    }
}
//코딩 테스트에서는 stream을 사용하기보단 for문 사용이 더 좋음
//stream이 .메소드()형식으로 계속 메모리를 사용하기 때문... 이랍니다.
//Arrays.메소드는 import만 해주면 int배열에도 사용이 가능하다.