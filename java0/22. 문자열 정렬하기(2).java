https://school.programmers.co.kr/learn/courses/30/lessons/120911

영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때, my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.

import java.util.*;
class Solution {
    public String solution(String my_string) {
        char[] answer = my_string.toLowerCase().toCharArray();
        Arrays.sort(answer);
        return new String(answer);
    }
}

//char 어레이를 어떻게 변환할까 생각했었는데 new String(String a)를 작성하면 되는구나!!!!