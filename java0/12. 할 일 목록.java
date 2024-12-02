https://school.programmers.co.kr/learn/courses/30/lessons/181885

오늘 해야 할 일이 담긴 문자열 배열 todo_list와 각각의 일을 지금 마쳤는지를 나타내는 boolean 배열 finished가 매개변수로 주어질 때, todo_list에서 아직 마치지 못한 일들을 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.

import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> answer = new ArrayList();
        for(int i=0; i< todo_list.length; i++){
            if(!finished[i])
                answer.add(todo_list[i]);
        }
         return answer.toArray(new String[0]);
    }
}
//자바에서는 new String[0]을 전달하면 toArray 메서드가 내부적으로 ArrayList의 크기를 확인해 적절한 크기의 배열을 새로 생성합니다.