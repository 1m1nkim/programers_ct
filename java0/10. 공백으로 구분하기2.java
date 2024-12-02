https://school.programmers.co.kr/learn/courses/30/lessons/181868

단어가 공백 한 개 이상으로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때, my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.

class Solution {
    public String[] solution(String my_string) {
        String answer[] = my_string.trim().replaceAll("\\s+", " ").split(" ");
        //return myString.trim().split("\\s+");
        return answer;
    }
}

// \\s+는 하나 이상의 공백 문자를 의미한다.
// trim은 앞 뒤 공백제거 함수
// split도 정규식을 사용할 수 있다.