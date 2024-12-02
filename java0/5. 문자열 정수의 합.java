https://school.programmers.co.kr/learn/courses/30/lessons/181849

한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 각 자리수의 합을 return하도록 solution 함수를 완성해주세요.

내 정답:
class Solution {
    public int solution(String num_str) {
        int sum = 0;
        int[] numbers = num_str.chars() 
        .filter((ch) -> (48 <= ch && ch <= 57))
        .map(ch -> ch - '0') 
        .toArray();
        for(int a : numbers)
            sum += a;
        return sum;
        좋은 정답 : //return num_Str.chars().map(c -> c - 48).sum();
    }
}

숫자 밖에 없어서 굳이 filter로 숫자를 안나눠 줘도 되고,
어레이에 담아 굳이 for 문을 사용하지 않고 .sum()메소드 자체를  return 해주는게 좋다.
