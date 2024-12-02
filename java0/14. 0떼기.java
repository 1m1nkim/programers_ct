https://school.programmers.co.kr/learn/courses/30/lessons/181847

정수로 이루어진 문자열 n_str이 주어질 때, n_str의 가장 왼쪽에 처음으로 등장하는 0들을 뗀 문자열을 return하도록 solution 함수를 완성해주세요.

class Solution {
    public String solution(String n_str) {
        
        return Integer.toString(Integer.parseInt(n_str));
    }
}

//return ""+Integer.parseInt(n_str);

//숫자형에 "" 더하면 자동으로 캐스트 되기 때문에 굳이 toString 작업을 해줄 필요가 없구나!!