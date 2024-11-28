https://school.programmers.co.kr/learn/courses/30/lessons/181939

연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.

12 ⊕ 3 = 123
3 ⊕ 12 = 312
양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.

단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.

class Solution {
    public int solution(int a, int b) {
        String middle1 = String.valueOf(a) + String.valueOf(b);
        String middle2 = String.valueOf(b) + String.valueOf(a);
        
        return Integer.parseInt(middle1) > Integer.parseInt(middle2)? Integer.parseInt                  (middle1) : Integer.parseInt(middle2);
    }
}

int answer = 0;
        int aLong = Integer.parseInt(""+a+b);
        int bLong = Integer.parseInt(""+b+a);
        answer = aLong > bLong ? aLong : bLong;

        return answer;

//그냥 integer.parseInt 사용하면 될 줄 알았는데 "" + a + b를 사용하면
//java는 문자열 + 숫자면 숫자가 문자열로 자동 형변환이 되는걸 이용하는 걸 알아두면 좋겠다.