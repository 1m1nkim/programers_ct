https://school.programmers.co.kr/learn/courses/30/lessons/181909

 어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다. 예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.
 문자열 my_string이 매개변수로 주어질 때, my_string의 모든 접미사를 사전순으로 정렬한 문자열 배열을 return 하는 solution 함수를 작성해 주세요.

import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        int a = my_string.length();
        String[] answer = new String[a];
        for(int i=0; i< a; i++){
            answer[i] = my_string.substring(i, a);
        }
        Arrays.sort(answer);
        return answer;
        //return Arrays.sort(answer)
    }
}
//주석문이 안되는 이유는 Arrays.sort()는 순서를 정렬해주는 메소드일 뿐이지 배열을 반환해주지는 않음