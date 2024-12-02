https://school.programmers.co.kr/learn/courses/30/lessons/120893

문자열 my_string이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.

class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();

        for (char s : my_string.toCharArray()) {
            if (s >= 'a' && s <= 'z') {
                answer.append((char) (s - 32));
            } else if (s >= 'A' && s <= 'Z') {
                answer.append((char) (s + 32));
            } else {
                answer.append(s);
            }
        }

        return answer.toString();
    }
}
//toLowerCase(s)
//toUpperCase(s) 사용하지 않고 아스키코드로 해결함
//answer += s는 계속해서 객체를 생성하므로 메모리에 안좋아
//StringBulider로 append해주는게 좋다.